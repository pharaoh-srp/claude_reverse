package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes.dex */
public final class vi9 extends z1 {
    public final JsonArray f;
    public final int g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi9(bg9 bg9Var, JsonArray jsonArray) {
        super(bg9Var, null);
        bg9Var.getClass();
        jsonArray.getClass();
        this.f = jsonArray;
        this.g = jsonArray.size();
        this.h = -1;
    }

    @Override // defpackage.z1
    public final JsonElement F(String str) {
        str.getClass();
        return this.f.get(Integer.parseInt(str));
    }

    @Override // defpackage.z1
    public final String R(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return String.valueOf(i);
    }

    @Override // defpackage.z1
    public final JsonElement T() {
        return this.f;
    }

    @Override // defpackage.ud4
    public final int x(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        int i = this.h;
        if (i >= this.g - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.h = i2;
        return i2;
    }
}
