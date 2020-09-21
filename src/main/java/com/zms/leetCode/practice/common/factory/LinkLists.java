package com.zms.leetCode.practice.common.factory;

import com.zms.leetCode.practice.common.LinkList;

public abstract class LinkLists {


    public static <T>LinkList<T> buildLinkLists(T... ts){
        LinkList<T> head=new LinkList<>(ts[0]);
        LinkList<T> thead=head;
        for(int i=1;i<ts.length;i++){
            LinkList<T> next=new LinkList<>(ts[i]);
            head.setNext(next);
            head=next;
        }
        return thead;
    }
}
