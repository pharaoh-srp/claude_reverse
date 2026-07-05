package defpackage;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileLock;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g4d {
    public static final byte[] c = new byte[0];
    public final /* synthetic */ int a;
    public final h99 b;

    public g4d(h99 h99Var, int i) {
        this.a = i;
        h99Var.getClass();
        switch (i) {
            case 1:
                this.b = h99Var;
                break;
            default:
                this.b = h99Var;
                break;
        }
    }

    public static void b(File file, boolean z, x1e x1eVar) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file, z);
        try {
            FileLock fileLockLock = fileOutputStream.getChannel().lock();
            fileLockLock.getClass();
            try {
                byte[] bArr = x1eVar.b;
                byte[] bArr2 = x1eVar.a;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr2.length + 6 + bArr.length + 6);
                byteBufferAllocate.getClass();
                ByteBuffer byteBufferPut = byteBufferAllocate.putShort(grc.d(2)).putInt(bArr.length).put(bArr);
                byteBufferPut.getClass();
                ByteBuffer byteBufferPut2 = byteBufferPut.putShort(grc.d(1)).putInt(bArr2.length).put(bArr2);
                byteBufferPut2.getClass();
                fileOutputStream.write(byteBufferPut2.array());
                fileOutputStream.close();
            } finally {
                fileLockLock.release();
            }
        } finally {
        }
    }

    public static void c(File file, boolean z, byte[] bArr) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file, z);
        try {
            FileLock fileLockLock = fileOutputStream.getChannel().lock();
            fileLockLock.getClass();
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } finally {
                fileLockLock.release();
            }
        } finally {
        }
    }

    public boolean a(int i, int i2, String str) {
        if (i == i2) {
            return true;
        }
        g99 g99Var = g99.F;
        h99 h99Var = this.b;
        if (i2 != -1) {
            dch.H(h99Var, 5, g99Var, new e4d(str, i, i2), null, false, 56);
            return false;
        }
        dch.H(h99Var, 5, g99Var, new rb1(str, 20), null, false, 56);
        return false;
    }

    public g11 d(BufferedInputStream bufferedInputStream, int i) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        int i2 = bufferedInputStream.read(byteBufferAllocate.array());
        if (!a(6, i2, ij0.j("Block(", grc.C(i), "): Header read"))) {
            return new g11((Object) null, Math.max(0, i2), 7);
        }
        short s = byteBufferAllocate.getShort();
        if (s != grc.d(i)) {
            dch.H(this.b, 5, g99.F, new f4d(s, i), null, false, 56);
            return new g11((Object) null, i2, 7);
        }
        int i3 = byteBufferAllocate.getInt();
        byte[] bArr = new byte[i3];
        int i4 = bufferedInputStream.read(bArr);
        return a(i3, i4, ij0.j("Block(", grc.C(i), "):Data read")) ? new g11(bArr, i2 + i4, 7) : new g11((Object) null, Math.max(0, i4) + i2, 7);
    }

    public Object e(File file) {
        byte[] bArr = c;
        g99 g99Var = g99.G;
        g99 g99Var2 = g99.F;
        try {
            if (!file.exists()) {
                dch.I(this.b, 5, x44.X(g99Var2, g99Var), new fh1(file, 17), null, 56);
                return bArr;
            }
            if (!file.isDirectory()) {
                return nk7.o0(file);
            }
            dch.I(this.b, 5, x44.X(g99Var2, g99Var), new fh1(file, 18), null, 56);
            return bArr;
        } catch (IOException e) {
            dch.I(this.b, 5, x44.X(g99Var2, g99Var), new fh1(file, 19), e, 48);
            return bArr;
        } catch (SecurityException e2) {
            dch.I(this.b, 5, x44.X(g99Var2, g99Var), new fh1(file, 20), e2, 48);
            return bArr;
        }
    }

    public List f(File file) {
        g99 g99Var = g99.G;
        g99 g99Var2 = g99.F;
        try {
            return g(file);
        } catch (IOException e) {
            dch.I(this.b, 5, x44.X(g99Var2, g99Var), new fh1(file, 12), e, 48);
            return lm6.E;
        } catch (SecurityException e2) {
            dch.I(this.b, 5, x44.X(g99Var2, g99Var), new fh1(file, 13), e2, 48);
            return lm6.E;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        r2 = r2 - r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList g(java.io.File r9) throws java.io.IOException {
        /*
            r8 = this;
            h99 r0 = r8.b
            long r0 = defpackage.fd9.i0(r9, r0)
            int r0 = (int) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r9)
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream
            r4 = 8192(0x2000, float:1.148E-41)
            r3.<init>(r2, r4)
            r2 = r0
        L19:
            if (r2 <= 0) goto L4b
            r4 = 2
            g11 r4 = r8.d(r3, r4)     // Catch: java.lang.Throwable -> L42
            int r5 = r4.F     // Catch: java.lang.Throwable -> L42
            java.lang.Object r4 = r4.G     // Catch: java.lang.Throwable -> L42
            byte[] r4 = (byte[]) r4     // Catch: java.lang.Throwable -> L42
            if (r4 != 0) goto L2a
            int r2 = r2 - r5
            goto L4b
        L2a:
            r6 = 1
            g11 r6 = r8.d(r3, r6)     // Catch: java.lang.Throwable -> L42
            int r7 = r6.F     // Catch: java.lang.Throwable -> L42
            int r5 = r5 + r7
            int r2 = r2 - r5
            java.lang.Object r5 = r6.G     // Catch: java.lang.Throwable -> L42
            byte[] r5 = (byte[]) r5     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L4b
            x1e r6 = new x1e     // Catch: java.lang.Throwable -> L42
            r6.<init>(r5, r4)     // Catch: java.lang.Throwable -> L42
            r1.add(r6)     // Catch: java.lang.Throwable -> L42
            goto L19
        L42:
            r0 = move-exception
            r8 = r0
            throw r8     // Catch: java.lang.Throwable -> L45
        L45:
            r0 = move-exception
            r9 = r0
            defpackage.wd6.Z(r3, r8)
            throw r9
        L4b:
            r3.close()
            if (r2 != 0) goto L5a
            if (r0 <= 0) goto L59
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L59
            goto L5a
        L59:
            return r1
        L5a:
            g99 r0 = defpackage.g99.E
            g99 r2 = defpackage.g99.G
            g99[] r0 = new defpackage.g99[]{r0, r2}
            java.util.List r4 = defpackage.x44.X(r0)
            fh1 r5 = new fh1
            r0 = 14
            r5.<init>(r9, r0)
            r6 = 0
            r7 = 56
            h99 r2 = r8.b
            r3 = 5
            defpackage.dch.I(r2, r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g4d.g(java.io.File):java.util.ArrayList");
    }

    public final boolean h(File file, Object obj, boolean z) {
        int i = this.a;
        g99 g99Var = g99.G;
        g99 g99Var2 = g99.F;
        switch (i) {
            case 0:
                byte[] bArr = (byte[]) obj;
                file.getClass();
                bArr.getClass();
                try {
                    c(file, z, bArr);
                } catch (IOException e) {
                    dch.I(this.b, 5, x44.X(g99Var2, g99Var), new fh1(file, 21), e, 48);
                    return false;
                } catch (SecurityException e2) {
                    dch.I(this.b, 5, x44.X(g99Var2, g99Var), new fh1(file, 22), e2, 48);
                    return false;
                }
                break;
            default:
                x1e x1eVar = (x1e) obj;
                file.getClass();
                try {
                    b(file, z, x1eVar);
                } catch (IOException e3) {
                    dch.I(this.b, 5, x44.W(g99Var2), new fh1(file, 15), e3, 48);
                    return false;
                } catch (SecurityException e4) {
                    dch.I(this.b, 5, x44.X(g99Var2, g99Var), new fh1(file, 16), e4, 48);
                    return false;
                }
                break;
        }
        return false;
    }
}
