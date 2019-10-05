package com.binarytree.validator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TreeBuilder {

    @Bean
    public BinaryTreeNode configureTree() {
        BinaryTreeNode treeNode = new BinaryTreeNode(6);
        BinaryTreeNode left = new BinaryTreeNode(4);
        treeNode.left = left;

        BinaryTreeNode left1 = new BinaryTreeNode(3);
        treeNode.left.left = left1;

        BinaryTreeNode right1 = new BinaryTreeNode(5);
        treeNode.left.right = right1;

        BinaryTreeNode right = new BinaryTreeNode(8);
        treeNode.right = right;

        BinaryTreeNode left2 = new BinaryTreeNode(7);
        BinaryTreeNode right2 = new BinaryTreeNode(11);
        treeNode.right.left = left2;
        treeNode.right.right = right2;

        return treeNode;
    }

    @Bean(initMethod = "init")
    public void init(){
        System.out.println("CONSTRUYENDO");
    }

    @Bean(destroyMethod = "destroy")
    public void destroy() {
        System.out.println("DESTRUYENDO");

    }
}
