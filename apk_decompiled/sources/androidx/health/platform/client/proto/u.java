package androidx.health.platform.client.proto;

import defpackage.ake;
import defpackage.d2e;
import defpackage.l28;
import defpackage.mr9;
import defpackage.o89;
import defpackage.p3;
import defpackage.sq6;
import defpackage.utc;
import defpackage.uud;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends n {
    public static final int ASC_ORDERING_FIELD_NUMBER = 7;
    public static final int DATA_ORIGIN_FILTERS_FIELD_NUMBER = 3;
    public static final int DATA_TYPE_FIELD_NUMBER = 2;
    private static final u DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 4;
    public static final int PAGE_SIZE_FIELD_NUMBER = 5;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 6;
    private static volatile utc PARSER = null;
    public static final int TIME_SPEC_FIELD_NUMBER = 1;
    private int bitField0_;
    private h dataType_;
    private int limit_;
    private int pageSize_;
    private z timeSpec_;
    private o89 dataOriginFilters_ = uud.H;
    private boolean ascOrdering_ = true;
    private String pageToken_ = "";

    static {
        u uVar = new u();
        DEFAULT_INSTANCE = uVar;
        n.n(u.class, uVar);
    }

    public static void p(u uVar, z zVar) {
        uVar.getClass();
        uVar.timeSpec_ = zVar;
        uVar.bitField0_ |= 1;
    }

    public static void q(u uVar, h hVar) {
        uVar.getClass();
        uVar.dataType_ = hVar;
        uVar.bitField0_ |= 2;
    }

    public static void r(u uVar, ArrayList arrayList) {
        o89 o89Var = uVar.dataOriginFilters_;
        if (!((p3) o89Var).E) {
            int size = o89Var.size();
            uVar.dataOriginFilters_ = o89Var.j(size == 0 ? 10 : size * 2);
        }
        a.a(arrayList, uVar.dataOriginFilters_);
    }

    public static void s(u uVar, boolean z) {
        uVar.bitField0_ |= 4;
        uVar.ascOrdering_ = z;
    }

    public static void t(u uVar, int i) {
        uVar.bitField0_ |= 16;
        uVar.pageSize_ = i;
    }

    public static void u(u uVar, String str) {
        uVar.getClass();
        str.getClass();
        uVar.bitField0_ |= 32;
        uVar.pageToken_ = str;
    }

    public static ake v() {
        return (ake) DEFAULT_INSTANCE.d();
    }

    public static u w(byte[] bArr) {
        return (u) n.m(DEFAULT_INSTANCE, bArr);
    }

    @Override // androidx.health.platform.client.proto.n
    public final Object e(int i) {
        utc l28Var;
        switch (sq6.F(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d2e(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004င\u0003\u0005င\u0004\u0006ဈ\u0005\u0007ဇ\u0002", new Object[]{"bitField0_", "timeSpec_", "dataType_", "dataOriginFilters_", e.class, "limit_", "pageSize_", "pageToken_", "ascOrdering_"});
            case 3:
                return new u();
            case 4:
                return new ake(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                utc utcVar = PARSER;
                if (utcVar != null) {
                    return utcVar;
                }
                synchronized (u.class) {
                    try {
                        l28Var = PARSER;
                        if (l28Var == null) {
                            l28Var = new l28();
                            PARSER = l28Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return l28Var;
            default:
                mr9.x();
                return null;
        }
    }
}
