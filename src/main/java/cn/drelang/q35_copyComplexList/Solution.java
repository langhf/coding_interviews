package cn.drelang.q35_copyComplexList;

/**
 * 问题：复杂链表的复制
 *    请实现函数ComplexListNode* Clone(ComplexListNode* pHead)，复
 * 制一个复杂链表。在复杂链表中，每个结点除了有一个m_pNext指针指向下一个
 * 结点外，还有一个m_pSibling 指向链表中的任意结点或者nullptr。
 *
 * Created by Drelang on 2019/03/11 10:47
 */
abstract class Solution {
    abstract RandomListNode clone(RandomListNode phead);
}
