package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes.dex */
public abstract class bg9 {
    public static final ag9 d = new ag9(new rg9(false, false, false, false, false, true, "    ", "type", true, ch3.G, true), hof.a);
    public final rg9 a;
    public final fof b;
    public final efe c = new efe((byte) 0, 13);

    public bg9(rg9 rg9Var, fof fofVar) {
        this.a = rg9Var;
        this.b = fofVar;
    }

    public final Object a(s06 s06Var, JsonElement jsonElement) {
        Decoder wh9Var;
        s06Var.getClass();
        jsonElement.getClass();
        String str = null;
        if (jsonElement instanceof JsonObject) {
            wh9Var = new ti9(this, (JsonObject) jsonElement, str, 12);
        } else if (jsonElement instanceof JsonArray) {
            wh9Var = new vi9(this, (JsonArray) jsonElement);
        } else {
            if (!(jsonElement instanceof jh9) && !jsonElement.equals(JsonNull.INSTANCE)) {
                mr9.b();
                return null;
            }
            wh9Var = new wh9(this, (JsonPrimitive) jsonElement);
        }
        return wh9Var.g(s06Var);
    }

    public final Object b(String str, s06 s06Var) {
        s06Var.getClass();
        str.getClass();
        irg irgVarJ = x44.j(this, str);
        Object objG = new sqg(this, qij.G, irgVarJ, s06Var.getDescriptor(), null).g(s06Var);
        irgVarJ.o();
        return objG;
    }

    public final JsonElement c(Object obj, znf znfVar) {
        znfVar.getClass();
        return v40.S(this, obj, znfVar);
    }

    public final String d(Object obj, znf znfVar) {
        znfVar.getClass();
        g11 g11Var = new g11(5, false, false);
        fi2 fi2Var = fi2.c;
        g11Var.G = fi2Var.d(FreeTypeConstants.FT_LOAD_PEDANTIC);
        try {
            iv1.q(this, g11Var, znfVar, obj);
            String string = g11Var.toString();
            char[] cArr = (char[]) g11Var.G;
            fi2Var.getClass();
            cArr.getClass();
            fi2Var.b(cArr);
            return string;
        } catch (Throwable th) {
            fi2 fi2Var2 = fi2.c;
            char[] cArr2 = (char[]) g11Var.G;
            fi2Var2.getClass();
            cArr2.getClass();
            fi2Var2.b(cArr2);
            throw th;
        }
    }

    public final JsonElement e(String str) {
        str.getClass();
        return (JsonElement) b(str, eh9.a);
    }
}
