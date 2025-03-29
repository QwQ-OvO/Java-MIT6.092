package Lec3;

public class ArrayLoopExample2 {

    public  static void main(String[] args) {
        /** 1. 使用 new 关键字创建长度为5的整型数组（默认初始化为全0） */
        int[] values = new int[5];
        int i = 0;

        /** 2. 使用 while 循环遍历数组 */
        while (i < values.length) {
            values[i] = i;
            int y = values[i] * values[i];
            System.out.println(y);
            /** 3. i++ 写在循环体末尾 */
            i++;
        }
    }
}

/** 关键点解析：
一、为什么 i++ 要写在循环体最后？
   - **避免死循环**：若未递增 i，条件 `i < values.length` 将永远成立。
   - **保证顺序执行**：先操作当前索引（赋值、计算），再移动到下一个索引。
   - **与 for 循环对比**：
     for 循环的 `i++` 在每次迭代后自动执行，而 while 循环需手动控制。

二、为什么要用 `new` 创建数组？
   - **动态内存分配**：`new int[5]` 在堆内存中分配连续空间存储5个整数。
   - **明确初始化**：指定数组长度（此处为5），并初始化为默认值（int数组初始化为0）。
   - **语法要求**：Java规定，数组作为对象必须通过 `new` 或静态初始化（如 `{1,2,3}`）创建。

三、代码执行流程：
   1. 创建数组 values，初始值为 [0,0,0,0,0]。
   2. 循环执行：
      - i=0 → values[0]=0 → y=0 → 输出0 → i=1
      - i=1 → values[1]=1 → y=1 → 输出1 → i=2
      - i=2 → values[2]=2 → y=4 → 输出4 → i=3
      - i=3 → values[3]=3 → y=9 → 输出9 → i=4
      - i=4 → values[4]=4 → y=16 → 输出16 → i=5（终止循环）
*/
