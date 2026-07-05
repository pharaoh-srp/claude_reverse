package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public final class r56 implements y3i {
    public final byte[] a = new byte[FreeTypeConstants.FT_LOAD_MONOCHROME];

    @Override // defpackage.y3i
    public final void a(long j, int i, int i2, int i3, x3i x3iVar) {
    }

    @Override // defpackage.y3i
    public final void b(ssc sscVar, int i, int i2) {
        sscVar.N(i);
    }

    @Override // defpackage.y3i
    public final int f(og5 og5Var, int i, boolean z) throws EOFException {
        byte[] bArr = this.a;
        int i2 = og5Var.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        sz6.n();
        return 0;
    }

    @Override // defpackage.y3i
    public final void g(jw7 jw7Var) {
    }
}
