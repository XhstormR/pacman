# pacman

解析 pacman 数据库，获取包依赖关系。

```
D:\Download>java -jar pacman.jar mingw64 https://mirrors.tuna.tsinghua.edu.cn/msys2/mingw/x86_64/ mingw-w64-x86_64-gcc
Searching for mingw-w64-x86_64-gcc
Searching for mingw-w64-x86_64-binutils
Searching for mingw-w64-x86_64-libiconv
Searching for mingw-w64-x86_64-zlib
Searching for mingw-w64-x86_64-crt
Searching for mingw-w64-x86_64-headers-git
Searching for mingw-w64-x86_64-headers
Searching for mingw-w64-x86_64-isl
Searching for mingw-w64-x86_64-libiconv
Searching for mingw-w64-x86_64-mpc
Searching for mingw-w64-x86_64-mpfr
Searching for mingw-w64-x86_64-gmp
Searching for mingw-w64-x86_64-gcc-libs=9.2.0-2
Searching for mingw-w64-x86_64-gmp
Searching for mingw-w64-x86_64-mpc
Searching for mingw-w64-x86_64-mpfr
Searching for mingw-w64-x86_64-gmp
Searching for mingw-w64-x86_64-mpfr
Searching for mingw-w64-x86_64-gmp
Searching for mingw-w64-x86_64-libwinpthread
Searching for mingw-w64-x86_64-windows-default-manifest
Searching for mingw-w64-x86_64-winpthreads
Searching for mingw-w64-x86_64-crt-git
Searching for mingw-w64-x86_64-headers-git
Searching for mingw-w64-x86_64-libwinpthread-git=8.0.0.5574.33e5a2ac
Searching for mingw-w64-x86_64-zlib
https://mirrors.tuna.tsinghua.edu.cn/msys2/mingw/x86_64/mingw-w64-x86_64-gcc-9.2.0-2-any.pkg.tar.xz
https://mirrors.tuna.tsinghua.edu.cn/msys2/mingw/x86_64/mingw-w64-x86_64-binutils-2.33.1-1-any.pkg.tar.xz
https://mirrors.tuna.tsinghua.edu.cn/msys2/mingw/x86_64/mingw-w64-x86_64-libiconv-1.16-1-any.pkg.tar.xz
https://mirrors.tuna.tsinghua.edu.cn/msys2/mingw/x86_64/mingw-w64-x86_64-zlib-1.2.11-7-any.pkg.tar.xz
https://mirrors.tuna.tsinghua.edu.cn/msys2/mingw/x86_64/mingw-w64-x86_64-crt-git-8.0.0.5576.34082b63-1-any.pkg.tar.xz
https://mirrors.tuna.tsinghua.edu.cn/msys2/mingw/x86_64/mingw-w64-x86_64-headers-git-8.0.0.5576.34082b63-1-any.pkg.tar.xz
https://mirrors.tuna.tsinghua.edu.cn/msys2/mingw/x86_64/mingw-w64-x86_64-isl-0.22-1-any.pkg.tar.xz
https://mirrors.tuna.tsinghua.edu.cn/msys2/mingw/x86_64/mingw-w64-x86_64-mpc-1.1.0-1-any.pkg.tar.xz
https://mirrors.tuna.tsinghua.edu.cn/msys2/mingw/x86_64/mingw-w64-x86_64-mpfr-4.0.2-2-any.pkg.tar.xz
https://mirrors.tuna.tsinghua.edu.cn/msys2/mingw/x86_64/mingw-w64-x86_64-gmp-6.1.2-1-any.pkg.tar.xz
https://mirrors.tuna.tsinghua.edu.cn/msys2/mingw/x86_64/mingw-w64-x86_64-gcc-libs-9.2.0-2-any.pkg.tar.xz
https://mirrors.tuna.tsinghua.edu.cn/msys2/mingw/x86_64/mingw-w64-x86_64-libwinpthread-git-8.0.0.5574.33e5a2ac-1-any.pkg.tar.xz
https://mirrors.tuna.tsinghua.edu.cn/msys2/mingw/x86_64/mingw-w64-x86_64-windows-default-manifest-6.4-3-any.pkg.tar.xz
https://mirrors.tuna.tsinghua.edu.cn/msys2/mingw/x86_64/mingw-w64-x86_64-winpthreads-git-8.0.0.5574.33e5a2ac-1-any.pkg.tar.xz

D:\Download>java -jar pacman.jar msys https://mirrors.tuna.tsinghua.edu.cn/msys2/msys/x86_64/ gcc
Searching for gcc
Searching for gcc-libs=9.1.0-2
Searching for msys2-runtime
Searching for binutils
Searching for libiconv
Searching for gcc-libs
Searching for msys2-runtime
Searching for libintl
Searching for gcc-libs
Searching for msys2-runtime
Searching for libiconv
Searching for gcc-libs
Searching for msys2-runtime
Searching for zlib
Searching for gcc-libs
Searching for msys2-runtime
Searching for gmp
Searching for isl
Searching for gmp
Searching for mpc
Searching for gmp>=5.0
Searching for mpfr
Searching for gmp>=5.0
Searching for mpfr
Searching for gmp>=5.0
Searching for msys2-runtime-devel
Searching for msys2-runtime=3.0.7
Searching for msys2-w32api-headers
Searching for msys2-w32api-runtime
Searching for msys2-w32api-headers
Searching for windows-default-manifest
https://mirrors.tuna.tsinghua.edu.cn/msys2/msys/x86_64/gcc-9.1.0-2-x86_64.pkg.tar.xz
https://mirrors.tuna.tsinghua.edu.cn/msys2/msys/x86_64/gcc-libs-9.1.0-2-x86_64.pkg.tar.xz
https://mirrors.tuna.tsinghua.edu.cn/msys2/msys/x86_64/msys2-runtime-3.0.7-6-x86_64.pkg.tar.xz
https://mirrors.tuna.tsinghua.edu.cn/msys2/msys/x86_64/binutils-2.30-2-x86_64.pkg.tar.xz
https://mirrors.tuna.tsinghua.edu.cn/msys2/msys/x86_64/libiconv-1.16-1-x86_64.pkg.tar.xz
https://mirrors.tuna.tsinghua.edu.cn/msys2/msys/x86_64/libintl-0.19.8.1-1-x86_64.pkg.tar.xz
https://mirrors.tuna.tsinghua.edu.cn/msys2/msys/x86_64/zlib-1.2.11-1-x86_64.pkg.tar.xz
https://mirrors.tuna.tsinghua.edu.cn/msys2/msys/x86_64/gmp-6.1.2-1-x86_64.pkg.tar.xz
https://mirrors.tuna.tsinghua.edu.cn/msys2/msys/x86_64/isl-0.21-1-x86_64.pkg.tar.xz
https://mirrors.tuna.tsinghua.edu.cn/msys2/msys/x86_64/mpc-1.1.0-1-x86_64.pkg.tar.xz
https://mirrors.tuna.tsinghua.edu.cn/msys2/msys/x86_64/mpfr-4.0.2-1-x86_64.pkg.tar.xz
https://mirrors.tuna.tsinghua.edu.cn/msys2/msys/x86_64/msys2-runtime-devel-3.0.7-6-x86_64.pkg.tar.xz
https://mirrors.tuna.tsinghua.edu.cn/msys2/msys/x86_64/msys2-w32api-headers-7.0.0.5479.8db8dd5a-1-x86_64.pkg.tar.xz
https://mirrors.tuna.tsinghua.edu.cn/msys2/msys/x86_64/msys2-w32api-runtime-7.0.0.5479.8db8dd5a-1-x86_64.pkg.tar.xz
https://mirrors.tuna.tsinghua.edu.cn/msys2/msys/x86_64/windows-default-manifest-6.4-1-x86_64.pkg.tar.xz
```
