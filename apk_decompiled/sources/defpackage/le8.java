package defpackage;

import android.util.SparseArray;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class le8 {
    public final y3i a;
    public final boolean b;
    public final boolean c;
    public final tsc f;
    public byte[] g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public long l;
    public boolean o;
    public long p;
    public long q;
    public boolean r;
    public boolean s;
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public ke8 m = new ke8();
    public ke8 n = new ke8();

    public le8(y3i y3iVar, boolean z, boolean z2) {
        this.a = y3iVar;
        this.b = z;
        this.c = z2;
        byte[] bArr = new byte[FreeTypeConstants.FT_LOAD_PEDANTIC];
        this.g = bArr;
        this.f = new tsc(bArr, 0, 0);
        this.k = false;
        this.o = false;
        ke8 ke8Var = this.n;
        ke8Var.b = false;
        ke8Var.a = false;
    }
}
