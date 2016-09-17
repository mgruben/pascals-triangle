
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Copyright (C) 2016 Michael <GrubenM@GMail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 *
 * @author Michael <GrubenM@GMail.com>
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        
        // Handle bad numRows input
        if (numRows <= 0) return ans;
        ans.add(new ArrayList<>(Arrays.asList(1)));
        
        // Handle just wanting the first row
        if (numRows == 1) return ans;
        ans.add(new ArrayList<>(Arrays.asList(1, 1)));
        int i = 2;
        
        // Use the above row to fill the current row, then add to ans
        while (i < numRows) {
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
            }
            row.add(1);
            ans.add(row);
            i++;
        }
        return ans;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.generate(5));
    }
    
}
