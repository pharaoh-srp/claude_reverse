package defpackage;

import java.util.List;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xpg {
    public static final String a(String str) {
        str.getClass();
        if (str.length() <= 80) {
            return str;
        }
        return bsg.j1(Character.isHighSurrogate(str.charAt(79)) ? 79 : 80, str).concat("…");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0155  */
    /* JADX WARN: Type inference failed for: r0v114 */
    /* JADX WARN: Type inference failed for: r0v115 */
    /* JADX WARN: Type inference failed for: r0v116 */
    /* JADX WARN: Type inference failed for: r0v117 */
    /* JADX WARN: Type inference failed for: r0v51, types: [com.anthropic.claude.tool.model.ConwaySuggestConnectorsOutput] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56, types: [kotlinx.serialization.json.JsonPrimitive] */
    /* JADX WARN: Type inference failed for: r0v58, types: [kotlinx.serialization.json.JsonPrimitive] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65, types: [kotlinx.serialization.json.JsonElement] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [kotlinx.serialization.json.JsonPrimitive] */
    /* JADX WARN: Type inference failed for: r10v12, types: [kotlinx.serialization.json.JsonPrimitive] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r12v6, types: [bg9, ih9] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r9v10, types: [kotlinx.serialization.json.JsonPrimitive] */
    /* JADX WARN: Type inference failed for: r9v11, types: [kotlinx.serialization.json.JsonPrimitive] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [kotlinx.serialization.json.JsonObject] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.d8a b(java.util.List r25, defpackage.hz4 r26) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpg.b(java.util.List, hz4):d8a");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final JsonObject c(int i, JsonElement jsonElement) {
        if (i <= 4) {
            if (jsonElement instanceof JsonObject) {
                JsonObject jsonObject = (JsonObject) jsonElement;
                JsonElement jsonElement2 = (JsonElement) jsonObject.get((Object) "text");
                String content = jsonElement2 != null ? ch9.j(jsonElement2).getContent() : null;
                if (content != null) {
                    JsonElement jsonElement3 = (JsonElement) jsonObject.get((Object) "type");
                    if (x44.r(jsonElement3 != null ? ch9.j(jsonElement3).getContent() : null, "text")) {
                        return c(i + 1, ex4.a.e(content));
                    }
                }
                return jsonObject;
            }
            if (jsonElement instanceof JsonArray) {
                JsonElement jsonElement4 = (JsonElement) w44.N0((List) jsonElement);
                if (jsonElement4 != null) {
                    return c(i + 1, jsonElement4);
                }
            } else {
                if (!(jsonElement instanceof JsonPrimitive)) {
                    wg6.i();
                    return null;
                }
                JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
                if (jsonPrimitive.isString()) {
                    return c(i + 1, ex4.a.e(jsonPrimitive.getContent()));
                }
            }
        }
        return null;
    }
}
