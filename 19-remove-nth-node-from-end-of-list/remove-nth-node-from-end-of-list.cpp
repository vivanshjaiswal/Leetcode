/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        int length=0;
       
        ListNode* dummynode=new ListNode(0);
        dummynode->next=head;
        ListNode* curr=head;
        while(curr!=NULL){
            length++;
            curr=curr->next;
        }
        curr=dummynode;
        int pos=length-n;
        for(int i=0;i<pos;i++){
           curr=curr->next;
        }
        if(curr->next!=NULL){
            curr->next=curr->next->next;
        }
        return dummynode->next;
    }
};