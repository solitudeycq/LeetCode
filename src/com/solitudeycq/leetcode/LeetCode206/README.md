## LeetCode 206
[LeetCode 206](https://leetcode-cn.com/problems/reverse-linked-list/)
### 解题思路 <br>
#### 思路1：递归地反转链表 <br>
递归的终止条件：<br>
（1）head为null，直接返回null。<br>
（2）head.next为null，直接返回head。<br>
递归的过程：<br>
我们新的头节点记为newHead，其值应该是翻转以head.next为头节点的链表的结果。同时把head放在head.next的后面，并令head.next为null，这样我们就把head元素放在了新链表的末尾。<br>
由于涉及到递归，而每一次递归的时间复杂度都是O(1)级别的，因此时间复杂度和空间复杂度都是O(n)级别的。<br>
#### 思路2：迭代反转链表 <br>
设立虚拟头节点dummyHead和三个指针cur1、cur2、cur3反转链表；<br>
令cur1指向虚拟头节点dummyHea；<br>
如果cur1.next是一个空节点或者说cur1.next.next是一个空节点，即链表中没有节点或链表中只有一个节点，无需翻转，直接返回head即可；<br>
令cur2指向cur1.next，cur3指向cur2.next。在我的定义中，cur2指向的是待处理节点的前一个节点，cur3指向的是待处理节点。只要cur3不为null，就进行以下循环:<br>
（1）令cur2.next指向cur3.next;<br>
（2）设立临时变量temp存储cur1.next结点。令cur1.next节点指向cur3，即将待处理节点放在第一个节点的位置，而令cur3.next为temp;<br>
（3）更新cur3的值为cur2.next;<br>
最后我们返回翻转后的结果dummyHead.next即可。