curl https://mirrors.tuna.tsinghua.edu.cn/msys2/mingw/x86_64/mingw64.db -o mingw64.tar.gz
busybox mkdir -p mingw64 & busybox tar -xf mingw64.tar.gz -C mingw64

:: java -jar pacman.jar D:\Download\mingw64 https://mirrors.tuna.tsinghua.edu.cn/msys2/mingw/x86_64/ gcc
:: busybox find -name *.xz -exec busybox tar -xf {} ;
