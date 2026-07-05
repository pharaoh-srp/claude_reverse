package defpackage;

import com.squareup.moshi.JsonDataException;

/* JADX INFO: loaded from: classes.dex */
public final class kkg extends gg9 {
    public final /* synthetic */ int a;

    public /* synthetic */ kkg(int i) {
        this.a = i;
    }

    @Override // defpackage.gg9
    public final Object fromJson(ci9 ci9Var) {
        switch (this.a) {
            case 0:
                return ci9Var.nextString();
            case 1:
                return Boolean.valueOf(ci9Var.e());
            case 2:
                return Byte.valueOf((byte) yfd.R(ci9Var, "a byte", -128, 255));
            case 3:
                String strNextString = ci9Var.nextString();
                if (strNextString.length() <= 1) {
                    return Character.valueOf(strNextString.charAt(0));
                }
                throw new JsonDataException(ij0.k("Expected a char but was ", grc.n('\"', "\"", strNextString), " at path ", ci9Var.c()));
            case 4:
                return Double.valueOf(ci9Var.nextDouble());
            case 5:
                float fNextDouble = (float) ci9Var.nextDouble();
                if (ci9Var.d() || !Float.isInfinite(fNextDouble)) {
                    return Float.valueOf(fNextDouble);
                }
                throw new JsonDataException("JSON forbids NaN and infinities: " + fNextDouble + " at path " + ci9Var.c());
            case 6:
                return Integer.valueOf(ci9Var.nextInt());
            case 7:
                return Long.valueOf(ci9Var.nextLong());
            default:
                return Short.valueOf((short) yfd.R(ci9Var, "a short", -32768, 32767));
        }
    }

    @Override // defpackage.gg9
    public final void toJson(jj9 jj9Var, Object obj) {
        switch (this.a) {
            case 0:
                jj9Var.r0((String) obj);
                break;
            case 1:
                jj9Var.x0(((Boolean) obj).booleanValue());
                break;
            case 2:
                jj9Var.b0(((Byte) obj).intValue() & 255);
                break;
            case 3:
                jj9Var.r0(((Character) obj).toString());
                break;
            case 4:
                jj9Var.T(((Double) obj).doubleValue());
                break;
            case 5:
                Float f = (Float) obj;
                f.getClass();
                jj9Var.l0(f);
                break;
            case 6:
                jj9Var.b0(((Integer) obj).intValue());
                break;
            case 7:
                jj9Var.b0(((Long) obj).longValue());
                break;
            default:
                jj9Var.b0(((Short) obj).intValue());
                break;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "JsonAdapter(String)";
            case 1:
                return "JsonAdapter(Boolean)";
            case 2:
                return "JsonAdapter(Byte)";
            case 3:
                return "JsonAdapter(Character)";
            case 4:
                return "JsonAdapter(Double)";
            case 5:
                return "JsonAdapter(Float)";
            case 6:
                return "JsonAdapter(Integer)";
            case 7:
                return "JsonAdapter(Long)";
            default:
                return "JsonAdapter(Short)";
        }
    }
}
