class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int l=0,r=skill.length-1;
        long chem=0;
        int check=skill[l]+skill[r];
        while(l<r){
            if(skill[l]+skill[r]!=check) return -1;
            chem+=skill[l]*skill[r];
            l++;r--;
        }
        return chem;
    }
}

