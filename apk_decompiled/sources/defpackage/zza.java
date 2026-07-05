package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zza {
    public final iwc a;
    public final String b;
    public final String c;
    public final boolean d;

    public zza(iwc iwcVar, String str, String str2, boolean z) {
        this.a = iwcVar;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zza)) {
            return false;
        }
        zza zzaVar = (zza) obj;
        return this.a.equals(zzaVar.a) && x44.r(this.b, zzaVar.b) && x44.r(this.c, zzaVar.c) && this.d == zzaVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "McpAuthRequiredCardState(pending=" + this.a + ", serverName=" + this.b + ", serverIconUrl=" + this.c + ", isConnecting=" + this.d + ")";
    }
}
