package defpackage;

import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final class xh9 extends c2 {
    public JsonElement g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh9(bg9 bg9Var, bz7 bz7Var) {
        super(bg9Var, bz7Var);
        bg9Var.getClass();
        bz7Var.getClass();
        this.a.add("primitive");
    }

    @Override // defpackage.c2
    public final JsonElement K() {
        JsonElement jsonElement = this.g;
        if (jsonElement != null) {
            return jsonElement;
        }
        sz6.p("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
        return null;
    }

    @Override // defpackage.c2
    public final void N(String str, JsonElement jsonElement) {
        str.getClass();
        jsonElement.getClass();
        if (str != "primitive") {
            sz6.p("This output can only consume primitives with 'primitive' tag");
        } else if (this.g != null) {
            sz6.p("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
        } else {
            this.g = jsonElement;
            this.c.invoke(jsonElement);
        }
    }
}
