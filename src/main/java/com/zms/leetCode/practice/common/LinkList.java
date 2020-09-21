package com.zms.leetCode.practice.common;

public class LinkList<T> {
    private T value;
    private LinkList<T> next;


    public LinkList(){}
    public LinkList(T value){
        this.value=value;
    }

    public T getValue() {
        return value;
    }

    public LinkList(LinkList<T> next) {
        this.next = next;
    }

    public LinkList<T> getNext() {
        return next;
    }

    public void setNext(LinkList<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(value);
        while (next!=null){
            sb.append(",");
            sb.append(next.value);
            next=next.next;
        }
        return sb.toString();
    }
}
