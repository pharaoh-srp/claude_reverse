package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class s26 {
    public final AssetManager a;
    public final Executor b;
    public final oid c;
    public final byte[] d;
    public final File e;
    public final String f;
    public boolean g = false;
    public v26[] h;
    public byte[] i;

    public s26(AssetManager assetManager, Executor executor, oid oidVar, String str, File file) {
        byte[] bArr;
        this.a = assetManager;
        this.b = executor;
        this.c = oidVar;
        this.f = str;
        this.e = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 26:
                    bArr = nvj.e;
                    break;
                case 27:
                    bArr = nvj.d;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = nvj.c;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = nvj.b;
        }
        this.d = bArr;
    }

    public final boolean a() {
        if (this.d == null) {
            d(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        File file = this.e;
        if (!file.exists()) {
            try {
                if (!file.createNewFile()) {
                    d(4, null);
                    return false;
                }
            } catch (IOException unused) {
                d(4, null);
                return false;
            }
        } else if (!file.canWrite()) {
            d(4, null);
            return false;
        }
        this.g = true;
        return true;
    }

    public final FileInputStream b(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.s26 c() {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s26.c():s26");
    }

    public final void d(int i, Serializable serializable) {
        this.b.execute(new y94(this, i, serializable, 2));
    }

    public final void e() {
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        oid oidVar = this.c;
        v26[] v26VarArr = this.h;
        if (v26VarArr == null || (bArr = this.d) == null) {
            return;
        }
        if (!this.g) {
            sz6.j("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
            return;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(lvj.c);
                byteArrayOutputStream.write(bArr);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            oidVar.n(7, e);
        } catch (IllegalStateException e2) {
            oidVar.n(8, e2);
        }
        if (lvj.p(byteArrayOutputStream, bArr, v26VarArr)) {
            this.i = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.h = null;
        } else {
            oidVar.n(5, null);
            this.h = null;
            byteArrayOutputStream.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f() {
        byte[] bArr = this.i;
        if (bArr != null) {
            if (!this.g) {
                sz6.j("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                return false;
            }
            try {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(this.e);
                        try {
                            FileChannel channel = fileOutputStream.getChannel();
                            try {
                                FileLock fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    try {
                                        if (fileLockTryLock.isValid()) {
                                            byte[] bArr2 = new byte[512];
                                            while (true) {
                                                int i = byteArrayInputStream.read(bArr2);
                                                if (i <= 0) {
                                                    d(1, null);
                                                    fileLockTryLock.close();
                                                    channel.close();
                                                    fileOutputStream.close();
                                                    byteArrayInputStream.close();
                                                    return true;
                                                }
                                                fileOutputStream.write(bArr2, 0, i);
                                            }
                                        }
                                    } finally {
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e) {
                    d(6, e);
                    return false;
                } catch (IOException e2) {
                    d(7, e2);
                    return false;
                }
            } finally {
                this.i = null;
                this.h = null;
            }
        }
        return false;
    }
}
