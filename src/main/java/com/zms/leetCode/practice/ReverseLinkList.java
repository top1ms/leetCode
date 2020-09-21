package com.zms.leetCode.practice;


import com.zms.leetCode.practice.common.LinkList;
import com.zms.leetCode.practice.common.factory.LinkLists;

public class ReverseLinkList {
    public static void main(String[] args) {
        LinkList<Integer> integerLinkList= LinkLists.buildLinkLists(1,2,3,4);
        System.out.println(integerLinkList.toString());


    }
}
