package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dsk extends zdk {
    private static final dsk zzb;

    static {
        dsk dskVar = new dsk();
        zzb = dskVar;
        zdk.f(dsk.class, dskVar);
    }

    public static dsk q() {
        return zzb;
    }

    @Override // defpackage.zdk
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 2;
        if (i2 == 2) {
            return new glk(zzb, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new dsk();
        }
        if (i2 == 4) {
            return new n5k(i3);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
