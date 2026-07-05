package defpackage;

import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public final class vmi implements m9 {
    public String a;
    public JsonObject b;

    @Override // defpackage.m9
    public final vlg a(vlg vlgVar) {
        wmi wmiVar = (wmi) vlgVar;
        wmiVar.getClass();
        return new wmi(wmiVar.a, this.a, this.b);
    }
}
