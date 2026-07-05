package defpackage;

import java.util.Map;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ec1 {
    public static final ide a = new ide("\\bmeta\\s*=\\s*\\{[^}]*?\\bname\\s*:\\s*['\"]([^'\"]+)['\"]");
    public static final ide b = new ide("(?:agentId|taskId|Task ID|with ID): ([a-z0-9][a-z0-9_-]*)");

    public static final String a(Map map) {
        ova ovaVarB;
        String str;
        map.getClass();
        Object obj = map.get("name");
        JsonPrimitive jsonPrimitive = obj instanceof JsonPrimitive ? (JsonPrimitive) obj : null;
        if (jsonPrimitive != null) {
            x29 x29Var = ch9.a;
            String content = jsonPrimitive instanceof JsonNull ? null : jsonPrimitive.getContent();
            if (content != null) {
                if (content.length() <= 0) {
                    content = null;
                }
                if (content != null) {
                    return content;
                }
            }
        }
        Object obj2 = map.get("script");
        JsonPrimitive jsonPrimitive2 = obj2 instanceof JsonPrimitive ? (JsonPrimitive) obj2 : null;
        if (jsonPrimitive2 != null) {
            x29 x29Var2 = ch9.a;
            String content2 = jsonPrimitive2 instanceof JsonNull ? null : jsonPrimitive2.getContent();
            if (content2 != null && (ovaVarB = a.b(content2)) != null && (str = (String) ((mva) ovaVarB.a()).get(1)) != null) {
                return str;
            }
        }
        Object obj3 = map.get("scriptPath");
        JsonPrimitive jsonPrimitive3 = obj3 instanceof JsonPrimitive ? (JsonPrimitive) obj3 : null;
        if (jsonPrimitive3 != null) {
            x29 x29Var3 = ch9.a;
            String content3 = jsonPrimitive3 instanceof JsonNull ? null : jsonPrimitive3.getContent();
            if (content3 != null) {
                if (content3.length() <= 0) {
                    content3 = null;
                }
                if (content3 != null) {
                    String str2 = (String) w44.U0(bsg.X0(content3, new char[]{'/', '\\'}, 6));
                    return bsg.i1('.', str2, str2);
                }
            }
        }
        return null;
    }
}
