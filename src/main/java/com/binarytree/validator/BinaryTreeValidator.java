package com.binarytree.validator;


import org.springframework.stereotype.Service;

@Service
public class BinaryTreeValidator {

    public boolean isValid(BinaryTreeNode root, int min, int max) {

        if (root == null) {
            return true;
        }

        System.out.println("Printing" + root.value);

        if ((root.value <= min) || (root.value > max)) {
            return false;
        }


        return isValid(root.left, min, root.value) && isValid(root.right, root.value, max);
    }
}
