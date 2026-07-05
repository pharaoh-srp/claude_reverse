package defpackage;

import android.content.Context;
import android.util.Log;
import com.mikepenz.aboutlibraries.Libs;
import com.mikepenz.aboutlibraries.entity.License;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class s3a extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ t3a F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s3a(t3a t3aVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = t3aVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new s3a(this.F, tp4Var, 0);
            default:
                return new s3a(this.F, tp4Var, 1);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 0:
                ((s3a) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((s3a) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        String strG0;
        ire ireVar;
        ?? arrayList;
        ?? arrayList2;
        int i = this.E;
        iei ieiVar = iei.a;
        t3a t3aVar = this.F;
        tp4 tp4Var = null;
        switch (i) {
            case 0:
                lm6 lm6Var = lm6.E;
                sf5.h0(obj);
                Context context = t3aVar.b;
                context.getClass();
                try {
                    InputStream inputStreamOpenRawResource = context.getResources().openRawResource(context.getResources().getIdentifier("aboutlibraries", "raw", context.getPackageName()));
                    inputStreamOpenRawResource.getClass();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, dj2.a), FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
                    try {
                        strG0 = d4c.g0(bufferedReader);
                        bufferedReader.close();
                    } finally {
                    }
                } catch (Throwable unused) {
                    Log.e("AboutLibraries", "Unable to retrieve library information given the `raw` resource identifier. \nPlease make sure either the gradle plugin is properly set up, or the file is manually provided. ");
                    System.out.println((Object) "Could not retrieve libraries");
                    strG0 = null;
                }
                if (strG0 == null) {
                    sz6.j("Please provide the required library data via the available APIs.\nDepending on the platform this can be done for example via `Libs.Builder().withJson()`.\nFor Android there exists an `Libs.Builder().withContext(context).build()`, automatically loading the `aboutlibraries.json` file from the `raw` resources folder.\nWhen using compose or other parent modules, please check their corresponding APIs.");
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(strG0);
                    JSONObject jSONObject2 = jSONObject.getJSONObject("licenses");
                    if (jSONObject2 == null) {
                        arrayList = lm6Var;
                    } else {
                        arrayList = new ArrayList();
                        Iterator<String> itKeys = jSONObject2.keys();
                        itKeys.getClass();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                            jSONObject3.getClass();
                            next.getClass();
                            String string = jSONObject3.getString("name");
                            string.getClass();
                            arrayList.add(new License(string, jSONObject3.optString("url"), jSONObject3.optString("year"), jSONObject3.optString("spdxId"), jSONObject3.optString("content"), next));
                        }
                    }
                    Iterable iterable = (Iterable) arrayList;
                    int iD0 = tta.d0(x44.y(iterable, 10));
                    if (iD0 < 16) {
                        iD0 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                    for (Object obj2 : iterable) {
                        linkedHashMap.put(((License) obj2).getHash(), obj2);
                    }
                    JSONArray jSONArray = jSONObject.getJSONArray("libraries");
                    v0 v0Var = new v0(8, linkedHashMap);
                    if (jSONArray == null) {
                        arrayList2 = lm6Var;
                    } else {
                        arrayList2 = new ArrayList();
                        int length = jSONArray.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            JSONObject jSONObject4 = jSONArray.getJSONObject(i2);
                            jSONObject4.getClass();
                            arrayList2.add(v0Var.invoke(jSONObject4));
                        }
                    }
                    ireVar = new ire(arrayList2, 0, arrayList);
                    break;
                } catch (Throwable th) {
                    Log.e("AboutLibraries", "Failed to parse the meta data *.json file: " + th);
                    ireVar = new ire(lm6Var, 0, lm6Var);
                }
                t3aVar.f.setValue(new Libs(csg.P(w44.i1((List) ireVar.F, new g67(14))), csg.Q((List) ireVar.G)));
                return ieiVar;
            default:
                sf5.h0(obj);
                if (((Libs) t3aVar.f.getValue()) == null && !((Boolean) t3aVar.d.getValue()).booleanValue()) {
                    gb9.D(t3aVar.a, null, null, new ix5(t3aVar, tp4Var, 23), 3);
                }
                return ieiVar;
        }
    }
}
