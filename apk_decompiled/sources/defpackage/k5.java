package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.MenuItem;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k5 {
    public Object a;
    public Object b;

    public k5(String str, Bundle bundle) {
        str.getClass();
        bundle.getClass();
        this.a = str;
        this.b = bundle;
    }

    public static byte[] o(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining % 16;
        int i2 = (i == 0 ? iRemaining : (iRemaining + 16) - i) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i2);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    public void c() {
        xg0 xg0Var = (xg0) this.a;
        if (xg0Var != null) {
            try {
                ((ah0) this.b).I.unregisterReceiver(xg0Var);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter d();

    public byte[] e(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            rl7.j("ciphertext too short");
            return null;
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            ((r34) this.b).a(bArr, 0).get(bArr4);
            if (!MessageDigest.isEqual(svj.f(bArr4, o(bArr2, byteBuffer)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            r34 r34Var = (r34) this.a;
            r34Var.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            r34Var.k(bArr, byteBufferAllocate, byteBuffer);
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    public void f(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            sz6.p("Given ByteBuffer output is too small");
            return;
        }
        int iPosition = byteBuffer.position();
        r34 r34Var = (r34) this.a;
        r34Var.getClass();
        if (byteBuffer.remaining() < bArr2.length) {
            sz6.p("Given ByteBuffer output is too small");
            return;
        }
        r34Var.k(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        ByteBuffer byteBufferA = ((r34) this.b).a(bArr, 0);
        byte[] bArr4 = new byte[32];
        byteBufferA.get(bArr4);
        byte[] bArrF = svj.f(bArr4, o(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(bArrF);
    }

    public abstract int[] g(int i);

    public abstract int h();

    public Bundle i() {
        return (Bundle) this.b;
    }

    public MenuItem j(MenuItem menuItem) {
        if (!(menuItem instanceof yyg)) {
            return menuItem;
        }
        yyg yygVar = (yyg) menuItem;
        if (((w6g) this.b) == null) {
            this.b = new w6g(0);
        }
        MenuItem menuItem2 = (MenuItem) ((w6g) this.b).get(yygVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        gdb gdbVar = new gdb((Context) this.a, yygVar);
        ((w6g) this.b).put(yygVar, gdbVar);
        return gdbVar;
    }

    public int[] k(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public String l() {
        String str = (String) this.a;
        if (str != null) {
            return str;
        }
        x44.o0("text");
        throw null;
    }

    public String m() {
        return (String) this.a;
    }

    public void n(String str) {
        this.a = str;
    }

    public abstract r34 p(byte[] bArr, int i);

    public abstract void q();

    public abstract int[] r(int i);

    public void s() {
        c();
        IntentFilter intentFilterD = d();
        if (intentFilterD.countActions() == 0) {
            return;
        }
        if (((xg0) this.a) == null) {
            this.a = new xg0(0, this);
        }
        ((ah0) this.b).I.registerReceiver((xg0) this.a, intentFilterD);
    }

    public k5(Context context) {
        this.a = context;
    }

    public k5() {
        this.b = new int[2];
    }

    public k5(ah0 ah0Var) {
        this.b = ah0Var;
    }
}
