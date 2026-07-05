package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final class wh9 extends z1 {
    public final JsonElement f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh9(bg9 bg9Var, JsonElement jsonElement, String str) {
        super(bg9Var, str);
        bg9Var.getClass();
        jsonElement.getClass();
        this.f = jsonElement;
        this.a.add("primitive");
    }

    @Override // defpackage.z1
    public final JsonElement F(String str) {
        str.getClass();
        if (str == "primitive") {
            return this.f;
        }
        sz6.p("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    @Override // defpackage.z1
    public final JsonElement T() {
        return this.f;
    }

    @Override // defpackage.ud4
    public final int x(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return 0;
    }

    public /* synthetic */ wh9(bg9 bg9Var, JsonElement jsonElement) {
        this(bg9Var, jsonElement, null);
    }
}
