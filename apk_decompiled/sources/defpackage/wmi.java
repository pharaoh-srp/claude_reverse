package defpackage;

import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public final class wmi implements vlg {
    public static final tmi Companion = new tmi();
    public String a;
    public String b;
    public JsonObject c;

    public wmi(String str, String str2, JsonObject jsonObject) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = jsonObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmi)) {
            return false;
        }
        wmi wmiVar = (wmi) obj;
        return x44.r(this.a, wmiVar.a) && x44.r(this.b, wmiVar.b) && x44.r(this.c, wmiVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        JsonObject jsonObject = this.c;
        return iHashCode2 + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    public final String toString() {
        return "UserInfo(anonymousId=" + this.a + ", userId=" + this.b + ", traits=" + this.c + ')';
    }
}
