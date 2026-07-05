package defpackage;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public final class wi9 extends ti9 {
    public final JsonObject j;
    public final List k;
    public final int l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi9(bg9 bg9Var, JsonObject jsonObject) {
        super(bg9Var, jsonObject, (String) null, 12);
        bg9Var.getClass();
        this.j = jsonObject;
        List listP1 = w44.p1(jsonObject.keySet());
        this.k = listP1;
        this.l = listP1.size() * 2;
        this.m = -1;
    }

    @Override // defpackage.ti9, defpackage.z1
    public final JsonElement F(String str) {
        str.getClass();
        return this.m % 2 == 0 ? ch9.c(str) : (JsonElement) sta.f0(str, this.j);
    }

    @Override // defpackage.ti9, defpackage.z1
    public final String R(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return (String) this.k.get(i / 2);
    }

    @Override // defpackage.ti9, defpackage.z1
    public final JsonElement T() {
        return this.j;
    }

    @Override // defpackage.ti9
    /* JADX INFO: renamed from: Y */
    public final JsonObject T() {
        return this.j;
    }

    @Override // defpackage.ti9, defpackage.z1, defpackage.ud4
    public final void b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }

    @Override // defpackage.ti9, defpackage.ud4
    public final int x(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        int i = this.m;
        if (i >= this.l - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.m = i2;
        return i2;
    }
}
