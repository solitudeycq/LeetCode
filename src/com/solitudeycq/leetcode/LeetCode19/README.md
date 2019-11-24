## LeetCode 19
[LeetCode 19](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/)
### 解题思路 <br>
使用数组辅助记录链表长度信息，由于数组访问时间复杂度为o(1)，并且后期删除操作是常量，所以整个操作复杂度是o(链表长度)