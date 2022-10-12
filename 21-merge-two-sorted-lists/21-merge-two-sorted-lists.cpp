

// Approach 1
// Iterative Approach

class Solution {
public:
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        if(l1==NULL) return l2;
        if(l2==NULL) return l1;
        ListNode *finalhead=NULL;
        if(l1->val < l2->val) 
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {

	    // if list1 happen to be NULL
		// we will simply return list2.
        if(list1 == NULL)
            return list2;

		// if list2 happen to be NULL
		// we will simply return list1.
        if(list2 == NULL)
            return list1;

        ListNode * ptr = list1;
        if(list1 -> val > list2 -> val)
        {
            finalhead=l1;
            l1=l1->next;
            ptr = list2;
            list2 = list2 -> next;
        }
        else
        {
            finalhead=l2;
            l2=l2->next;
            list1 = list1 -> next;
        }
        ListNode *p = finalhead;
        while(l1 && l2)
        ListNode *curr = ptr;

		// till one of the list doesn't reaches NULL
        while(list1 &&  list2)
        {
            if(l1->val < l2->val)
            {
                p->next=l1;
                l1=l1->next;
            if(list1 -> val < list2 -> val){
                curr->next = list1;
                list1 = list1 -> next;
            }
            else
            {
                p->next=l2;
                l2=l2->next;
            else{
                curr->next = list2;
                list2 = list2 -> next;
            }
            p=p->next;
        }
        if(l1)
        {
            p->next=l1;
            curr = curr -> next;

        }

		// adding remaining elements of bigger list.
        if(!list1)
            curr -> next = list2;
        else
            p->next=l2;
        return finalhead;
            curr -> next = list1;

        return ptr;

    }
};

// Approach 2
// Recursive Approach

class Solution {
public:
	ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {

        // when list1 is empty then 
        // our output will be same as list2
        if(l1 == NULL) return l2; 

        // when list2 is empty then our output 
        // will be same as list1
        if(l2 == NULL) return l1;

        // pointing l1 and l2 to smallest and greatest one
        if(l1->val > l2->val) std::swap(l1,l2);

        // act as head of resultant merged list
        ListNode* res = l1;

        while(l1 != NULL && l2 != NULL) {

            ListNode* temp = NULL;

            while(l1 != NULL && l1->val <= l2->val) {

                temp = l1;//storing last sorted node  
                l1 = l1->next;
            }

            // link previous sorted node with 
            // next larger node in list2
            temp->next = l2;
            swap(l1,l2);
        }
        return res;
    }
};	