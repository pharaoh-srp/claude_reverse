package defpackage;

import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kya implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ lya F;
    public final /* synthetic */ JsonPrimitive G;

    public /* synthetic */ kya(lya lyaVar, JsonPrimitive jsonPrimitive, int i) {
        this.E = i;
        this.F = lyaVar;
        this.G = jsonPrimitive;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        JsonPrimitive jsonPrimitive = this.G;
        lya lyaVar = this.F;
        switch (i) {
            case 0:
                lyaVar.e(jsonPrimitive, lya.j);
                break;
            case 1:
                lyaVar.e(jsonPrimitive, lya.j);
                break;
            case 2:
                lya.f(lyaVar, jsonPrimitive);
                break;
            case 3:
                lya.f(lyaVar, jsonPrimitive);
                break;
            case 4:
                lya.f(lyaVar, jsonPrimitive);
                break;
            case 5:
                lyaVar.e(jsonPrimitive, lya.j);
                break;
            case 6:
                lya.f(lyaVar, jsonPrimitive);
                break;
            default:
                lyaVar.e(jsonPrimitive, lya.j);
                break;
        }
        return ieiVar;
    }
}
