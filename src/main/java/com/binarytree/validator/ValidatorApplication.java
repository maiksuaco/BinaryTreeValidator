package com.binarytree.validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.binarytree")
public class ValidatorApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(ValidatorApplication.class);

	@Autowired
	BinaryTreeNode tree;

	@Autowired
	BinaryTreeValidator validator;

	public static void main(String[] args) {
		SpringApplication.run(ValidatorApplication.class, args);
	}

	/**
	 * Callback used to run the bean.
	 *
	 * @param args incoming main method arguments
	 * @throws Exception on error
	 */
	@Override
	public void run(String... args) throws Exception {
		//ApplicationContext context = new AnnotationConfigApplicationContext(TreeBuilder.class, BinaryTreeValidator.class);

		//BinaryTreeNode tree = context.getBean(BinaryTreeNode.class);

		//BinaryTreeValidator validator = context.getBean(BinaryTreeValidator.class);
		LOG.info("Loggin en command line");

		LOG.info( Boolean.toString(validator.isValid(tree, Integer.MIN_VALUE, Integer.MAX_VALUE)));
	}
}
