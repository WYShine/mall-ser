package com.wysh1ne.algorithm;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-14
 **/

public class __208 {
    class Trie {
        Trie[] nodeArray;
        boolean isEnd;

        /** Initialize your data structure here. */
        public Trie() {
            nodeArray = new Trie[26];
            isEnd = false;
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            Trie cur = this;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                int index = c - 'a';
                if (cur.nodeArray[index] == null) {
                    cur.nodeArray[index] = new Trie();
                }
                cur = cur.nodeArray[index];
            }
            cur.isEnd = true;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            Trie trie = this.searchPrefix(word);
            return trie != null && trie.isEnd;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            return searchPrefix(prefix) != null;
        }

        private Trie searchPrefix(String word) {
            Trie trie = this;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                int index = ch - 'a';
                if (trie.nodeArray[index] == null) {
                    return null;
                }
                trie = trie.nodeArray[index];
            }
            return trie;
        }
    }
}
