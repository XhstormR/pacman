curl https://mirrors.tuna.tsinghua.edu.cn/msys2/mingw/x86_64/mingw64.db -o mingw64.tar.gz
busybox mkdir -p mingw64 & busybox tar -xf mingw64.tar.gz -C mingw64

curl https://mirrors.tuna.tsinghua.edu.cn/msys2/msys/x86_64/msys.db -o msys.tar.gz
busybox mkdir -p msys & busybox tar -xf msys.tar.gz -C msys

java -jar pacman.jar mingw64 https://mirrors.tuna.tsinghua.edu.cn/msys2/mingw/x86_64/ mingw-w64-x86_64-gcc
busybox find -name *.xz -exec busybox tar -xf {} ;

:: java -jar pacman.jar msys https://mirrors.tuna.tsinghua.edu.cn/msys2/msys/x86_64/ gcc
