package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class fta extends f9i {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final f9i c;
    public final Object d;

    public fta(v44 v44Var, xd8 xd8Var, Type type, f9i f9iVar, Type type2, f9i f9iVar2, sac sacVar) {
        this.b = new fta(xd8Var, f9iVar, type);
        this.c = new fta(xd8Var, f9iVar2, type2);
        this.d = sacVar;
    }

    @Override // defpackage.f9i
    public final Object a(JsonReader jsonReader) {
        int i = this.a;
        f9i f9iVar = this.c;
        switch (i) {
            case 0:
                f9i f9iVar2 = ((fta) f9iVar).c;
                f9i f9iVar3 = ((fta) this.b).c;
                JsonToken jsonTokenPeek = jsonReader.peek();
                if (jsonTokenPeek == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                Map map = (Map) ((sac) this.d).o0();
                if (jsonTokenPeek != JsonToken.BEGIN_ARRAY) {
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        di9.INSTANCE.promoteNameToValue(jsonReader);
                        Object objA = f9iVar3.a(jsonReader);
                        if (map.put(objA, f9iVar2.a(jsonReader)) != null) {
                            throw new JsonSyntaxException(ij0.h("duplicate key: ", objA));
                        }
                    }
                    jsonReader.endObject();
                    return map;
                }
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginArray();
                    Object objA2 = f9iVar3.a(jsonReader);
                    if (map.put(objA2, f9iVar2.a(jsonReader)) != null) {
                        throw new JsonSyntaxException(ij0.h("duplicate key: ", objA2));
                    }
                    jsonReader.endArray();
                }
                jsonReader.endArray();
                return map;
            default:
                return f9iVar.a(jsonReader);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    @Override // defpackage.f9i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.google.gson.stream.JsonWriter r4, java.lang.Object r5) {
        /*
            r3 = this;
            int r0 = r3.a
            f9i r1 = r3.c
            switch(r0) {
                case 0: goto L50;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r3.d
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            if (r5 == 0) goto L1a
            boolean r2 = r0 instanceof java.lang.Class
            if (r2 != 0) goto L15
            boolean r2 = r0 instanceof java.lang.reflect.TypeVariable
            if (r2 == 0) goto L1a
        L15:
            java.lang.Class r2 = r5.getClass()
            goto L1b
        L1a:
            r2 = r0
        L1b:
            if (r2 == r0) goto L4c
            java.lang.Object r3 = r3.b
            xd8 r3 = (defpackage.xd8) r3
            dbi r0 = new dbi
            r0.<init>(r2)
            f9i r3 = r3.c(r0)
            boolean r0 = r3 instanceof defpackage.sce
            if (r0 != 0) goto L2f
            goto L4b
        L2f:
            r0 = r1
        L30:
            boolean r2 = r0 instanceof defpackage.wd8
            if (r2 == 0) goto L46
            r2 = r0
            wd8 r2 = (defpackage.wd8) r2
            f9i r2 = r2.a
            if (r2 == 0) goto L40
            if (r2 != r0) goto L3e
            goto L46
        L3e:
            r0 = r2
            goto L30
        L40:
            java.lang.String r3 = "Adapter for type with cyclic dependency has been used before dependency has been resolved"
            defpackage.sz6.j(r3)
            goto L4f
        L46:
            boolean r0 = r0 instanceof defpackage.sce
            if (r0 != 0) goto L4b
            goto L4c
        L4b:
            r1 = r3
        L4c:
            r1.b(r4, r5)
        L4f:
            return
        L50:
            java.util.Map r5 = (java.util.Map) r5
            fta r1 = (defpackage.fta) r1
            if (r5 != 0) goto L5a
            r4.nullValue()
            goto L87
        L5a:
            r4.beginObject()
            java.util.Set r3 = r5.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L65:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L84
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r0 = r5.getKey()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.name(r0)
            java.lang.Object r5 = r5.getValue()
            r1.b(r4, r5)
            goto L65
        L84:
            r4.endObject()
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fta.b(com.google.gson.stream.JsonWriter, java.lang.Object):void");
    }

    public fta(xd8 xd8Var, f9i f9iVar, Type type) {
        this.b = xd8Var;
        this.c = f9iVar;
        this.d = type;
    }
}
