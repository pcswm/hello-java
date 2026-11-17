# Day 1 · 环境、第一个程序、Git

日期：2026-11-17
实际耗时：约 3 小时（比计划的 2 小时多，主要花在环境排错）

## 完成情况

- [x] `java -version` / `javac -version` 都输出 17.0.21
- [x] IDEA 里 Hello World 跑通（输出 `Hello World,java`，退出码 0）
- [ ] 命令行 `javac` + `java` 自己亲手跑一遍
- [x] GitHub 第一条 commit 已推送

## 环境清单（以后重装照着来）

| 组件 | 版本 | 位置 |
|---|---|---|
| JDK | Temurin 17.0.21+9 | `D:\java`（`JAVA_HOME=D:\java\`） |
| IDEA | 2025.3（统一安装包，30 天后自动回落免费版） | `C:\Program Files\JetBrains\` |
| Git | 2.56.1.windows.1 | `C:\Program Files\Git\cmd` |
| 项目 | `hello-java` | `C:\Users\Administrator\IdeaProjects\hello-java` |
| 远程 | `https://github.com/pcswm/hello-java.git` | 分支 `main` |

## 今天踩的坑（全部真实踩过）

1. **JDK 下载龟速** —— Adoptium 直链实际跳 GitHub，实测 77 KB/s。换清华镜像后 42.8 MB/s，差约 550 倍。
2. **MSI 安装默认不勾 `JAVA_HOME`** —— 要点击那一行前面的**图标**（不是文字），选"将安装到本地硬盘"。
3. **旧 cmd 窗口读不到新环境变量** —— 装完任何软件，必须新开窗口。
4. **`mian` 写成 `main`** —— 语法合法所以 IDE 不报错，但 JVM 找不到入口，右键菜单没有"运行"。这是最坑的一个。
5. **Git 的 PATH** —— 一开始 cmd 里没有 `git`，因为机器上只有 WorkBuddy 自带的便携版；装了正式版才解决。
6. **`Failed to connect to github.com:443`** —— DNS 污染（`github.com` 被解析到 `20.247.166.64` 假 IP），但 `api.github.com` 正常。重试 + 浏览器授权后成功。

## 关键认知

- JDK 没有"启动"这一说，它是工具集，配好环境就在那儿等着被调用。
- `javac` 编译 `.java` → 生成 `.class` 字节码；`java` 执行的是**类名**，不带 `.class` 后缀。
- Java 里 `main` 方法签名错一个字母，程序就完全没有入口，而编译器不会警告。
- C 盘和 D 盘是同一块 SSD 的两个分区，项目放哪个盘性能一样。
- 装 IDE 到 D 盘省不了多少空间，真正吃 C 盘的是 `AppData\Local\JetBrains` 里的索引缓存。

## 今日总结（自己补 3 行）

1. 今天最费时的不是写代码，是环境。
2. ______
3. ______

## 明日（Day 2）预告

变量、8 种基本类型、类型转换、运算符。重点是把 7 个经典坑亲手跑一遍：
`5/2`、`5.0/2`、`0.1+0.2`、`int` 溢出、`%` 负数、`i++ + ++i`。
产出：`Pitfalls.java`、温度转换器、BMI 计算器。
