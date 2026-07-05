package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class u81 extends mfa {
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final q0c g;

    public u81(long j, Integer num, long j2, byte[] bArr, String str, long j3, x81 x81Var) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = x81Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mfa) {
            mfa mfaVar = (mfa) obj;
            u81 u81Var = (u81) mfaVar;
            if (this.a == u81Var.a) {
                Integer num = u81Var.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.c == u81Var.c) {
                        if (Arrays.equals(this.d, mfaVar instanceof u81 ? ((u81) mfaVar).d : u81Var.d)) {
                            String str = u81Var.e;
                            String str2 = this.e;
                            if (str2 != null ? str2.equals(str) : str == null) {
                                if (this.f == u81Var.f) {
                                    q0c q0cVar = u81Var.g;
                                    q0c q0cVar2 = this.g;
                                    if (q0cVar2 != null ? q0cVar2.equals(q0cVar) : q0cVar == null) {
                                        return true;
                                    }
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
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j2 = this.c;
        int iHashCode2 = (((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f;
        int i2 = (iHashCode3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        q0c q0cVar = this.g;
        return i2 ^ (q0cVar != null ? q0cVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }
}
