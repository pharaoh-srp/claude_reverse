package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.ImageGalleryItem;
import com.anthropic.claude.api.chat.tool.ToolResultImageGallery;
import com.anthropic.claude.tool.custom.ImageSearchOutput;
import com.anthropic.claude.tool.custom.RecipeDisplayOutput;
import com.anthropic.claude.tool.model.ImageSearchInput;
import com.anthropic.claude.tool.model.RecipeDisplayV0Input;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gy8 extends dxh {
    public final /* synthetic */ int e = 0;
    public final gw8 f;
    public final rc8 g;
    public final qi3 h;
    public final String i;
    public final kw9 j;
    public final String k;
    public final dwh l;

    public gy8(mwh mwhVar, gw8 gw8Var, rc8 rc8Var, qi3 qi3Var, String str) {
        super(mwhVar, RecipeDisplayV0Input.Companion.serializer(), RecipeDisplayOutput.Companion.serializer());
        this.f = gw8Var;
        this.g = rc8Var;
        this.h = qi3Var;
        this.i = str;
        this.j = yb5.w(w1a.G, new dg8(25, this));
        this.k = hxh.n;
        this.l = new dwh();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dxh
    public final void c(String str, String str2, boolean z, dlb dlbVar, lvh lvhVar, boolean z2, boolean z3, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        List<ImageGalleryItem> images;
        e18 e18Var2;
        List<ImageGalleryItem> images2;
        e18 e18Var3;
        int i2 = this.e;
        int i3 = FreeTypeConstants.FT_LOAD_NO_RECURSE;
        boolean z4 = true;
        gw8 gw8Var = this.f;
        switch (i2) {
            case 0:
                ebh.B(str, str2, dlbVar, lvhVar, iqbVar);
                e18 e18Var4 = (e18) ld4Var;
                e18Var4.c0(-748410074);
                int i4 = (i & 6) == 0 ? i | (e18Var4.f(str) ? 4 : 2) : i;
                if ((i & 3072) == 0) {
                    if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var4.f(dlbVar) : e18Var4.h(dlbVar)) {
                        i3 = 2048;
                    }
                    i4 |= i3;
                }
                if ((i & 24576) == 0) {
                    i4 |= (i & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) == 0 ? e18Var4.f(lvhVar) : e18Var4.h(lvhVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                }
                if ((i & 196608) == 0) {
                    i4 |= e18Var4.g(z2) ? 131072 : 65536;
                }
                if ((i & 12582912) == 0) {
                    i4 |= e18Var4.f(iqbVar) ? 8388608 : 4194304;
                }
                if ((100663296 & i) == 0) {
                    i4 |= (i & 134217728) == 0 ? e18Var4.f(this) : e18Var4.h(this) ? 67108864 : 33554432;
                }
                int i5 = i4;
                if (e18Var4.Q(i5 & 1, (37823491 & i5) != 37823490)) {
                    Object objN = e18Var4.N();
                    lz1 lz1Var = jd4.a;
                    if (objN == lz1Var) {
                        objN = fd9.O(im6.E, e18Var4);
                        e18Var4.k0(objN);
                    }
                    l45 l45Var = (l45) objN;
                    Object objN2 = e18Var4.N();
                    if (objN2 == lz1Var) {
                        objN2 = mpk.P(null);
                        e18Var4.k0(objN2);
                    }
                    nwb nwbVar = (nwb) objN2;
                    ImageSearchOutput imageSearchOutput = (ImageSearchOutput) dlbVar.b();
                    if (imageSearchOutput == null || (images = imageSearchOutput.getImages()) == null) {
                        images = lm6.E;
                    }
                    ImageSearchInput imageSearchInput = (ImageSearchInput) dlbVar.a();
                    Object max_results = imageSearchInput != null ? imageSearchInput.getMax_results() : null;
                    String str3 = (String) this.j.getValue();
                    String strB = gw8Var.b(str);
                    boolean zA = gw8Var.a(str);
                    boolean zH = ((234881024 & i5) == 67108864 || ((i5 & 134217728) != 0 && e18Var4.h(this))) | ((i5 & 14) == 4) | e18Var4.h(l45Var);
                    if ((57344 & i5) != 16384 && ((i5 & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) == 0 || !e18Var4.h(lvhVar))) {
                        z4 = false;
                    }
                    boolean z5 = zH | z4;
                    Object objN3 = e18Var4.N();
                    if (z5 || objN3 == lz1Var) {
                        fy8 fy8Var = new fy8(this, str, nwbVar, l45Var, lvhVar, 0);
                        e18Var4.k0(fy8Var);
                        objN3 = fy8Var;
                    }
                    e18Var = e18Var4;
                    fuk.g(images, str, z2, max_results, str3, iqbVar, strB, zA, (pz7) objN3, e18Var, ((i5 << 3) & 112) | ((i5 >> 9) & 896) | (458752 & (i5 >> 6)), 0);
                } else {
                    e18Var = e18Var4;
                    e18Var.T();
                }
                r7e r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    r7eVarS.d = new ss(this, str, str2, z, dlbVar, lvhVar, z2, z3, iqbVar, i, 12);
                }
                break;
            default:
                ebh.B(str, str2, dlbVar, lvhVar, iqbVar);
                e18 e18Var5 = (e18) ld4Var;
                e18Var5.c0(-300431932);
                int i6 = (i & 6) == 0 ? i | (e18Var5.f(str) ? 4 : 2) : i;
                if ((i & 3072) == 0) {
                    if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var5.f(dlbVar) : e18Var5.h(dlbVar)) {
                        i3 = 2048;
                    }
                    i6 |= i3;
                }
                if ((i & 24576) == 0) {
                    i6 |= (i & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) == 0 ? e18Var5.f(lvhVar) : e18Var5.h(lvhVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                }
                if ((i & 196608) == 0) {
                    i6 |= e18Var5.g(z2) ? 131072 : 65536;
                }
                if ((1572864 & i) == 0) {
                    i6 |= e18Var5.g(z3) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
                }
                if ((i & 12582912) == 0) {
                    i6 |= e18Var5.f(iqbVar) ? 8388608 : 4194304;
                }
                if ((100663296 & i) == 0) {
                    i6 |= (i & 134217728) == 0 ? e18Var5.f(this) : e18Var5.h(this) ? 67108864 : 33554432;
                }
                if (e18Var5.Q(i6 & 1, (38347779 & i6) != 38347778)) {
                    Object objN4 = e18Var5.N();
                    lz1 lz1Var2 = jd4.a;
                    if (objN4 == lz1Var2) {
                        objN4 = fd9.O(im6.E, e18Var5);
                        e18Var5.k0(objN4);
                    }
                    l45 l45Var2 = (l45) objN4;
                    Object objN5 = e18Var5.N();
                    if (objN5 == lz1Var2) {
                        objN5 = mpk.P(null);
                        e18Var5.k0(objN5);
                    }
                    nwb nwbVar2 = (nwb) objN5;
                    RecipeDisplayV0Input recipeDisplayV0Input = (RecipeDisplayV0Input) dlbVar.a();
                    if (!z2 || z3 || recipeDisplayV0Input == null) {
                        e18Var2 = e18Var5;
                        e18Var2.a0(546508981);
                        RecipeDisplayV0Input recipeDisplayV0Input2 = (RecipeDisplayV0Input) dlbVar.a();
                        wg wgVar = new wg(recipeDisplayV0Input2 != null ? recipeDisplayV0Input2.getTitle() : null, 15, false);
                        p();
                        Object objN6 = e18Var2.N();
                        if (objN6 == lz1Var2) {
                            objN6 = new ll1(10);
                            e18Var2.k0(objN6);
                        }
                        zy7 zy7Var = (zy7) objN6;
                        int i7 = i6 >> 9;
                        auk.b(wgVar, R.drawable.anthropicon_checklist, z2, z3, zy7Var, iqbVar, false, 0L, false, null, null, e18Var2, (i7 & 7168) | (i7 & 896) | 1597440 | (458752 & (i6 >> 6)), 6, 896);
                        e18Var2.p(false);
                    } else {
                        e18Var5.a0(545054182);
                        String str4 = (String) this.j.getValue();
                        RecipeDisplayOutput recipeDisplayOutput = (RecipeDisplayOutput) dlbVar.b();
                        if (recipeDisplayOutput == null || (images2 = recipeDisplayOutput.getImages()) == null) {
                            images2 = lm6.E;
                        }
                        List<ImageGalleryItem> list = images2;
                        String strB2 = gw8Var.b(str);
                        boolean zA2 = gw8Var.a(str);
                        boolean zH2 = ((i6 & 14) == 4) | ((234881024 & i6) == 67108864 || ((i6 & 134217728) != 0 && e18Var5.h(this))) | e18Var5.h(l45Var2);
                        if ((57344 & i6) != 16384 && ((i6 & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) == 0 || !e18Var5.h(lvhVar))) {
                            z4 = false;
                        }
                        boolean z6 = zH2 | z4;
                        Object objN7 = e18Var5.N();
                        if (z6 || objN7 == lz1Var2) {
                            e18Var3 = e18Var5;
                            fy8 fy8Var2 = new fy8(this, str, nwbVar2, l45Var2, lvhVar, 1);
                            e18Var3.k0(fy8Var2);
                            objN7 = fy8Var2;
                        } else {
                            e18Var3 = e18Var5;
                        }
                        e18Var2 = e18Var3;
                        kkk.b(recipeDisplayV0Input, str, str4, iqbVar, list, strB2, zA2, (pz7) objN7, null, e18Var2, ((i6 << 3) & 112) | ((i6 >> 12) & 7168), FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                        e18Var2.p(false);
                    }
                } else {
                    e18Var2 = e18Var5;
                    e18Var2.T();
                }
                r7e r7eVarS2 = e18Var2.s();
                if (r7eVarS2 != null) {
                    r7eVarS2.d = new ss(this, str, str2, z, dlbVar, lvhVar, z2, z3, iqbVar, i, 19);
                }
                break;
        }
    }

    @Override // defpackage.dxh
    public final Object h(List list, tp4 tp4Var) {
        switch (this.e) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof ToolResultImageGallery) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b54.t0(arrayList2, ((ToolResultImageGallery) it.next()).getImages());
                }
                return new ImageSearchOutput(arrayList2);
            default:
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof ToolResultImageGallery) {
                        arrayList3.add(obj2);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    b54.t0(arrayList4, ((ToolResultImageGallery) it2.next()).getImages());
                }
                return new RecipeDisplayOutput(arrayList4);
        }
    }

    @Override // defpackage.dxh
    public final fwh n() {
        switch (this.e) {
        }
        return this.l;
    }

    @Override // defpackage.dxh
    public final vwh o() {
        switch (this.e) {
        }
        return new uwh(false);
    }

    @Override // defpackage.dxh
    public final int p() {
        switch (this.e) {
            case 0:
                ud0 ud0Var = ud0.d;
                ud0 ud0Var2 = ud0.d;
                return R.drawable.anthropicon_search;
            default:
                ud0 ud0Var3 = ud0.d;
                ud0 ud0Var4 = ud0.d;
                return R.drawable.anthropicon_checklist;
        }
    }

    @Override // defpackage.dxh
    public final String r() {
        switch (this.e) {
        }
        return this.k;
    }

    @Override // defpackage.dxh
    public final String s() {
        switch (this.e) {
        }
        return this.i;
    }

    public gy8(String str, mwh mwhVar, gw8 gw8Var, rc8 rc8Var, qi3 qi3Var) {
        super(mwhVar, ImageSearchInput.Companion.serializer(), ImageSearchOutput.Companion.serializer());
        this.i = str;
        this.f = gw8Var;
        this.g = rc8Var;
        this.h = qi3Var;
        this.k = hxh.w;
        this.l = new dwh();
        this.j = yb5.w(w1a.G, new dg8(6, this));
    }
}
