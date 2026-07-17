import random

class Solution(object):
    def __init__(self, head):
        self.head = head

    def _iter(self):
        cur = self.head
        while cur:
            yield cur.val
            cur = cur.next

    def getRandom(self):
        return max((random.random(), x) for x in self._iter())[1]