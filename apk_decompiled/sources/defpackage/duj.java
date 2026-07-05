package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public enum duj {
    RESPONSE_CODE_UNSPECIFIED(-999),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_TIMEOUT(-3),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE_NOT_SUPPORTED(-2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_DISCONNECTED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    OK(0),
    /* JADX INFO: Fake field, exist only in values array */
    USER_CANCELED(1),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_UNAVAILABLE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_UNAVAILABLE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEVELOPER_ERROR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_ALREADY_OWNED(7),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_NOT_OWNED(8),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED_OFFER_TOKEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(12);

    public static final l0k G;
    public final int E;

    static {
        s20 s20Var = new s20();
        s20Var.F = new Object[8];
        s20Var.E = 0;
        for (duj dujVar : values()) {
            Integer numValueOf = Integer.valueOf(dujVar.E);
            int i = s20Var.E + 1;
            Object[] objArr = (Object[]) s20Var.F;
            int length = objArr.length;
            int i2 = i + i;
            if (i2 > length) {
                if (i2 > length) {
                    length = length + (length >> 1) + 1;
                    if (length < i2) {
                        int iHighestOneBit = Integer.highestOneBit(i2 - 1);
                        length = iHighestOneBit + iHighestOneBit;
                    }
                    if (length < 0) {
                        length = Integer.MAX_VALUE;
                    }
                }
                s20Var.F = Arrays.copyOf(objArr, length);
            }
            Object[] objArr2 = (Object[]) s20Var.F;
            int i3 = s20Var.E;
            int i4 = i3 + i3;
            objArr2[i4] = numValueOf;
            objArr2[i4 + 1] = dujVar;
            s20Var.E = i3 + 1;
        }
        xxj xxjVar = (xxj) s20Var.G;
        if (xxjVar != null) {
            throw xxjVar.a();
        }
        l0k l0kVarA = l0k.a(s20Var.E, (Object[]) s20Var.F, s20Var);
        xxj xxjVar2 = (xxj) s20Var.G;
        if (xxjVar2 != null) {
            throw xxjVar2.a();
        }
        G = l0kVarA;
    }

    duj(int i) {
        this.E = i;
    }

    public static duj a(int i) {
        Integer numValueOf = Integer.valueOf(i);
        l0k l0kVar = G;
        return !l0kVar.containsKey(numValueOf) ? RESPONSE_CODE_UNSPECIFIED : (duj) l0kVar.get(numValueOf);
    }
}
