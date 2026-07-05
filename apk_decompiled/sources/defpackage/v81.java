package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v81 extends tfa {
    public final long a;
    public final long b;
    public final yo3 c;
    public final Integer d;
    public final String e;
    public final List f;
    public final ozd g;

    public v81(long j, long j2, l81 l81Var, Integer num, String str, ArrayList arrayList, ozd ozdVar) {
        this.a = j;
        this.b = j2;
        this.c = l81Var;
        this.d = num;
        this.e = str;
        this.f = arrayList;
        this.g = ozdVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tfa) {
            v81 v81Var = (v81) ((tfa) obj);
            if (this.a == v81Var.a && this.b == v81Var.b) {
                yo3 yo3Var = v81Var.c;
                yo3 yo3Var2 = this.c;
                if (yo3Var2 != null ? yo3Var2.equals(yo3Var) : yo3Var == null) {
                    Integer num = v81Var.d;
                    Integer num2 = this.d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = v81Var.e;
                        String str2 = this.e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            List list = v81Var.f;
                            List list2 = this.f;
                            if (list2 != null ? list2.equals(list) : list == null) {
                                ozd ozdVar = v81Var.g;
                                ozd ozdVar2 = this.g;
                                if (ozdVar2 != null ? ozdVar2.equals(ozdVar) : ozdVar == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        yo3 yo3Var = this.c;
        int iHashCode = (i ^ (yo3Var == null ? 0 : yo3Var.hashCode())) * 1000003;
        Integer num = this.d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        ozd ozdVar = this.g;
        return iHashCode4 ^ (ozdVar != null ? ozdVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }
}
