package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public class ui9 extends c2 {
    public final /* synthetic */ int g;
    public final Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui9(bg9 bg9Var, bz7 bz7Var, int i) {
        super(bg9Var, bz7Var);
        this.g = i;
        bg9Var.getClass();
        bz7Var.getClass();
        switch (i) {
            case 1:
                super(bg9Var, bz7Var);
                this.h = new ArrayList();
                break;
            default:
                this.h = new LinkedHashMap();
                break;
        }
    }

    @Override // defpackage.c2, defpackage.vd4
    public void B(SerialDescriptor serialDescriptor, int i, znf znfVar, Object obj) {
        switch (this.g) {
            case 0:
                serialDescriptor.getClass();
                znfVar.getClass();
                if (obj != null || this.d.f) {
                    super.B(serialDescriptor, i, znfVar, obj);
                }
                break;
            default:
                super.B(serialDescriptor, i, znfVar, obj);
                break;
        }
    }

    @Override // defpackage.c2
    public String G(SerialDescriptor serialDescriptor, int i) {
        switch (this.g) {
            case 1:
                serialDescriptor.getClass();
                return String.valueOf(i);
            default:
                return super.G(serialDescriptor, i);
        }
    }

    @Override // defpackage.c2
    public JsonElement K() {
        switch (this.g) {
            case 0:
                return new JsonObject((LinkedHashMap) this.h);
            default:
                return new JsonArray((ArrayList) this.h);
        }
    }

    @Override // defpackage.c2
    public void N(String str, JsonElement jsonElement) {
        int i = this.g;
        Object obj = this.h;
        str.getClass();
        jsonElement.getClass();
        switch (i) {
            case 0:
                ((LinkedHashMap) obj).put(str, jsonElement);
                break;
            default:
                ((ArrayList) obj).add(Integer.parseInt(str), jsonElement);
                break;
        }
    }
}
