package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final class rvh implements zpf {
    public final String a;
    public final String b;
    public final String c;
    public final Map d;
    public final String e;
    public final qvh f;
    public final List g;
    public final JsonElement h;
    public final String i;
    public final String j;

    public /* synthetic */ rvh(String str, String str2, String str3, Map map, String str4, String str5, int i) {
        this(str, str2, str3, map, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? qvh.E : qvh.F, null, null, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : str5);
    }

    @Override // defpackage.zpf
    public final String a() {
        return this.b;
    }

    @Override // defpackage.zpf
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.zpf
    public final String getType() {
        return this.j;
    }

    public rvh(String str, String str2, String str3, Map map, String str4, qvh qvhVar, ArrayList arrayList, JsonElement jsonElement, String str5) {
        str.getClass();
        str3.getClass();
        map.getClass();
        qvhVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = map;
        this.e = str4;
        this.f = qvhVar;
        this.g = arrayList;
        this.h = jsonElement;
        this.i = str5;
        this.j = "tool";
    }
}
