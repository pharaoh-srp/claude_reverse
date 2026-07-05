package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class krc {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        dlh[] dlhVarArr = clh.b;
        a = clh.c;
    }

    public static final jrc a(jrc jrcVar, int i, int i2, long j, hjh hjhVar, i5d i5dVar, d6a d6aVar, int i3, int i4, hkh hkhVar) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        hjh hjhVar2 = hjhVar;
        i5d i5dVar2 = i5dVar;
        d6a d6aVar2 = d6aVar;
        int i7 = i3;
        int i8 = i4;
        hkh hkhVar2 = hkhVar;
        if (i5 == 0 || i5 == jrcVar.a) {
            dlh[] dlhVarArr = clh.b;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
                if (clh.a(j3, jrcVar.c)) {
                }
            }
            if ((hjhVar2 == null || hjhVar2.equals(jrcVar.d)) && ((i6 == 0 || i6 == jrcVar.b) && ((i5dVar2 == null || i5dVar2.equals(jrcVar.e)) && ((d6aVar2 == null || d6aVar2.equals(jrcVar.f)) && ((i7 == 0 || i7 == jrcVar.g) && ((i8 == 0 || i8 == jrcVar.h) && (hkhVar2 == null || hkhVar2.equals(jrcVar.i)))))))) {
                return jrcVar;
            }
        } else {
            j2 = 0;
        }
        dlh[] dlhVarArr2 = clh.b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = jrcVar.c;
        }
        if (hjhVar2 == null) {
            hjhVar2 = jrcVar.d;
        }
        if (i5 == 0) {
            i5 = jrcVar.a;
        }
        if (i6 == 0) {
            i6 = jrcVar.b;
        }
        i5d i5dVar3 = jrcVar.e;
        if (i5dVar3 != null && i5dVar2 == null) {
            i5dVar2 = i5dVar3;
        }
        if (d6aVar2 == null) {
            d6aVar2 = jrcVar.f;
        }
        if (i7 == 0) {
            i7 = jrcVar.g;
        }
        if (i8 == 0) {
            i8 = jrcVar.h;
        }
        if (hkhVar2 == null) {
            hkhVar2 = jrcVar.i;
        }
        return new jrc(i5, i6, j3, hjhVar2, i5dVar2, d6aVar2, i7, i8, hkhVar2);
    }
}
