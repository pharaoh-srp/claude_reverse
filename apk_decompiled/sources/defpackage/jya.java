package defpackage;

import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jya implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ lya F;
    public final /* synthetic */ JsonPrimitive G;
    public final /* synthetic */ Exception H;

    public /* synthetic */ jya(lya lyaVar, JsonPrimitive jsonPrimitive, Exception exc, int i) {
        this.E = i;
        this.F = lyaVar;
        this.G = jsonPrimitive;
        this.H = exc;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        Exception exc = this.H;
        JsonPrimitive jsonPrimitive = this.G;
        lya lyaVar = this.F;
        switch (i) {
            case 0:
                String message = exc.getMessage();
                lyaVar.c(jsonPrimitive, -32602, message != null ? message : "Invalid params");
                break;
            case 1:
                String message2 = exc.getMessage();
                lyaVar.c(jsonPrimitive, -32602, message2 != null ? message2 : "Invalid params");
                break;
            default:
                String message3 = exc.getMessage();
                if (message3 == null) {
                    message3 = "Unknown error";
                }
                JsonObject jsonObject = lya.j;
                lyaVar.c(jsonPrimitive, -32603, message3);
                break;
        }
        return ieiVar;
    }
}
