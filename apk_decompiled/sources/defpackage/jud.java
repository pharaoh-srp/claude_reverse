package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.anthropic.claude.R;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class jud {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public jud(int i) {
        this.a = i;
        switch (i) {
            case 5:
                break;
            default:
                this.b = new int[]{2131230845, 2131230843, 2131230769};
                this.c = new int[]{2131230793, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.d = new int[]{2131230842, 2131230844, 2131230786, R.drawable.abc_text_cursor_material, 2131230839, 2131230840, 2131230841};
                this.e = new int[]{2131230818, R.drawable.abc_cab_background_internal_bg, 2131230817};
                this.f = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.g = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
        }
    }

    public static jud a(qh9 qh9Var) {
        jud judVar = new jud(5);
        judVar.c = x41.i(qh9Var, "name");
        judVar.d = x41.i(qh9Var, "resource");
        judVar.g = x41.i(qh9Var, "sample_rate");
        judVar.b = x41.i(qh9Var, "service");
        judVar.f = x41.i(qh9Var, "target_span");
        judVar.e = x41.s(qh9Var);
        return judVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.jud r6, java.lang.String r7, defpackage.vp4 r8) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jud.b(jud, java.lang.String, vp4):java.lang.Object");
    }

    public static boolean d(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static jud e(String str, k22 k22Var, qo9 qo9Var, bmc bmcVar, Integer num) throws GeneralSecurityException {
        if (bmcVar == bmc.RAW) {
            if (num != null) {
                rl7.j("Keys with output prefix type raw should not have an id requirement.");
                return null;
            }
        } else if (num == null) {
            rl7.j("Keys with output prefix type different from raw should have an id requirement.");
            return null;
        }
        return new jud(str, k22Var, qo9Var, bmcVar, num);
    }

    public static ColorStateList f(Context context, int i) {
        int iC = qlh.c(context, R.attr.colorControlHighlight);
        int iB = qlh.b(context, R.attr.colorButtonNormal);
        int[] iArr = qlh.b;
        int[] iArr2 = qlh.d;
        int iB2 = x54.b(iC, i);
        return new ColorStateList(new int[][]{iArr, iArr2, qlh.c, qlh.f}, new int[]{iB, iB2, x54.b(iC, i), i});
    }

    public static LayerDrawable g(upe upeVar, Context context, int i) {
        if (i == R.drawable.abc_cab_background_top_material) {
            return new LayerDrawable(new Drawable[]{upeVar.e(context, R.drawable.abc_cab_background_internal_bg), upeVar.e(context, 2131230786)});
        }
        if (i == R.drawable.abc_ratingbar_material) {
            return i(upeVar, context, R.dimen.abc_star_big);
        }
        if (i == R.drawable.abc_ratingbar_indicator_material) {
            return i(upeVar, context, R.dimen.abc_star_medium);
        }
        if (i == R.drawable.abc_ratingbar_small_material) {
            return i(upeVar, context, R.dimen.abc_star_small);
        }
        return null;
    }

    public static z7b h(v77 v77Var, nz8 nz8Var, z7b z7bVar, jqh jqhVar) {
        mqh mqhVarJ = v77Var.j();
        int iG = v77Var.g();
        Object objL = mqhVarJ.p() ? null : mqhVarJ.l(iG);
        int iB = (v77Var.r() || mqhVarJ.p()) ? -1 : mqhVarJ.f(iG, jqhVar, false).b(tpi.C(v77Var.h()) - jqhVar.e);
        for (int i = 0; i < nz8Var.size(); i++) {
            z7b z7bVar2 = (z7b) nz8Var.get(i);
            if (l(z7bVar2, objL, v77Var.r(), v77Var.d(), v77Var.e(), iB)) {
                return z7bVar2;
            }
        }
        if (nz8Var.isEmpty() && z7bVar != null && l(z7bVar, objL, v77Var.r(), v77Var.d(), v77Var.e(), iB)) {
            return z7bVar;
        }
        return null;
    }

    public static LayerDrawable i(upe upeVar, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableE = upeVar.e(context, R.drawable.abc_star_black_48dp);
        Drawable drawableE2 = upeVar.e(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableE instanceof BitmapDrawable) && drawableE.getIntrinsicWidth() == dimensionPixelSize && drawableE.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableE;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableE.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableE.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableE2 instanceof BitmapDrawable) && drawableE2.getIntrinsicWidth() == dimensionPixelSize && drawableE2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableE2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableE2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableE2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static PorterDuff.Mode k(int i) {
        if (i == R.drawable.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    public static boolean l(z7b z7bVar, Object obj, boolean z, int i, int i2, int i3) {
        Object obj2 = z7bVar.a;
        int i4 = z7bVar.b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z && i4 == i && z7bVar.c == i2) {
            return true;
        }
        return !z && i4 == -1 && z7bVar.e == i3;
    }

    public static void m(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterF;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = ch0.b;
        }
        PorterDuff.Mode mode2 = ch0.b;
        synchronized (ch0.class) {
            porterDuffColorFilterF = upe.f(i, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterF);
    }

    public static boolean n(Context context, int i, Drawable drawable) {
        if (i == R.drawable.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
            int iC = qlh.c(context, R.attr.colorControlNormal);
            PorterDuff.Mode mode = ch0.b;
            m(drawableFindDrawableByLayerId, iC, mode);
            m(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), qlh.c(context, R.attr.colorControlNormal), mode);
            m(layerDrawable.findDrawableByLayerId(android.R.id.progress), qlh.c(context, R.attr.colorControlActivated), mode);
            return true;
        }
        if (i != R.drawable.abc_ratingbar_material && i != R.drawable.abc_ratingbar_indicator_material && i != R.drawable.abc_ratingbar_small_material) {
            return false;
        }
        LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
        Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
        int iB = qlh.b(context, R.attr.colorControlNormal);
        PorterDuff.Mode mode2 = ch0.b;
        m(drawableFindDrawableByLayerId2, iB, mode2);
        m(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), qlh.c(context, R.attr.colorControlActivated), mode2);
        m(layerDrawable2.findDrawableByLayerId(android.R.id.progress), qlh.c(context, R.attr.colorControlActivated), mode2);
        return true;
    }

    public void c(s20 s20Var, z7b z7bVar, mqh mqhVar) {
        if (z7bVar == null) {
            return;
        }
        if (mqhVar.b(z7bVar.a) != -1) {
            s20Var.l(z7bVar, mqhVar);
            return;
        }
        mqh mqhVar2 = (mqh) ((aee) this.d).get(z7bVar);
        if (mqhVar2 != null) {
            s20Var.l(z7bVar, mqhVar2);
        }
    }

    public ColorStateList j(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return x44.K(context, R.color.abc_tint_edittext);
        }
        if (i == 2131230835) {
            return x44.K(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return f(context, qlh.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return f(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return f(context, qlh.c(context, R.attr.colorAccent));
            }
            if (i == 2131230830 || i == R.drawable.abc_spinner_textfield_background_material) {
                return x44.K(context, R.color.abc_tint_spinner);
            }
            if (d(i, (int[]) this.c)) {
                return qlh.d(context, R.attr.colorControlNormal);
            }
            if (d(i, (int[]) this.f)) {
                return x44.K(context, R.color.abc_tint_default);
            }
            if (d(i, (int[]) this.g)) {
                return x44.K(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return x44.K(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = qlh.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = qlh.b;
            iArr2[0] = qlh.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = qlh.e;
            iArr2[1] = qlh.c(context, R.attr.colorControlActivated);
            iArr[2] = qlh.f;
            iArr2[2] = qlh.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = qlh.b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = qlh.e;
            iArr2[1] = qlh.c(context, R.attr.colorControlActivated);
            iArr[2] = qlh.f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            r5 = this;
            android.graphics.PorterDuff$Mode r0 = defpackage.ch0.b
            java.lang.Object r1 = r5.b
            int[] r1 = (int[]) r1
            boolean r1 = d(r7, r1)
            r2 = 1
            r3 = 0
            r4 = -1
            if (r1 == 0) goto L15
            r5 = 2130968813(0x7f0400ed, float:1.754629E38)
        L12:
            r1 = r2
        L13:
            r7 = r4
            goto L51
        L15:
            java.lang.Object r1 = r5.d
            int[] r1 = (int[]) r1
            boolean r1 = d(r7, r1)
            if (r1 == 0) goto L23
            r5 = 2130968811(0x7f0400eb, float:1.7546286E38)
            goto L12
        L23:
            java.lang.Object r5 = r5.e
            int[] r5 = (int[]) r5
            boolean r5 = d(r7, r5)
            r1 = 16842801(0x1010031, float:2.3693695E-38)
            if (r5 == 0) goto L34
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
        L32:
            r5 = r1
            goto L12
        L34:
            r5 = 2131230806(0x7f080056, float:1.8077675E38)
            if (r7 != r5) goto L48
            r5 = 1109603123(0x42233333, float:40.8)
            int r5 = java.lang.Math.round(r5)
            r7 = 16842800(0x1010030, float:2.3693693E-38)
            r1 = r7
            r7 = r5
            r5 = r1
            r1 = r2
            goto L51
        L48:
            r5 = 2131230788(0x7f080044, float:1.8077639E38)
            if (r7 != r5) goto L4e
            goto L32
        L4e:
            r5 = r3
            r1 = r5
            goto L13
        L51:
            if (r1 == 0) goto L6f
            android.graphics.drawable.Drawable r8 = r8.mutate()
            int r5 = defpackage.qlh.c(r6, r5)
            java.lang.Class<ch0> r6 = defpackage.ch0.class
            monitor-enter(r6)
            android.graphics.PorterDuffColorFilter r5 = defpackage.upe.f(r5, r0)     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r6)
            r8.setColorFilter(r5)
            if (r7 == r4) goto L6b
            r8.setAlpha(r7)
        L6b:
            return r2
        L6c:
            r5 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6c
            throw r5
        L6f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jud.o(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    public void p(mqh mqhVar) {
        nz8 nz8Var;
        s20 s20Var = new s20(4);
        if (((nz8) this.c).isEmpty()) {
            c(s20Var, (z7b) this.f, mqhVar);
            if (!Objects.equals((z7b) this.g, (z7b) this.f)) {
                c(s20Var, (z7b) this.g, mqhVar);
            }
            if (!Objects.equals((z7b) this.e, (z7b) this.f) && !Objects.equals((z7b) this.e, (z7b) this.g)) {
                c(s20Var, (z7b) this.e, mqhVar);
            }
        } else {
            int i = 0;
            while (true) {
                int size = ((nz8) this.c).size();
                nz8Var = (nz8) this.c;
                if (i >= size) {
                    break;
                }
                c(s20Var, (z7b) nz8Var.get(i), mqhVar);
                i++;
            }
            if (!nz8Var.contains((z7b) this.e)) {
                c(s20Var, (z7b) this.e, mqhVar);
            }
        }
        this.d = s20Var.d(true);
    }

    public String toString() {
        switch (this.a) {
            case 5:
                qh9 qh9Var = new qh9();
                String str = (String) this.c;
                if (str != null) {
                    qh9Var.r("name", str);
                }
                String str2 = (String) this.d;
                if (str2 != null) {
                    qh9Var.r("resource", str2);
                }
                String str3 = (String) this.g;
                if (str3 != null) {
                    qh9Var.r("sample_rate", str3);
                }
                String str4 = (String) this.b;
                if (str4 != null) {
                    qh9Var.r("service", str4);
                }
                String str5 = (String) this.f;
                if (str5 != null) {
                    qh9Var.r("target_span", str5);
                }
                HashMap map = (HashMap) this.e;
                if (map != null) {
                    qh9Var.o("tags", oq5.y(map));
                }
                return qh9Var.toString();
            default:
                return super.toString();
        }
    }

    public jud(mp4 mp4Var, jwf jwfVar, otf otfVar, a4e a4eVar, p14 p14Var, l14 l14Var) {
        this.a = 4;
        mp4Var.getClass();
        jwfVar.getClass();
        otfVar.getClass();
        a4eVar.getClass();
        this.c = jwfVar;
        this.d = otfVar;
        this.e = a4eVar;
        this.f = p14Var;
        this.g = l14Var;
    }

    public jud(String str, k22 k22Var, qo9 qo9Var, bmc bmcVar, Integer num) {
        this.a = 0;
        this.b = str;
        this.c = rpi.b(str);
        this.d = k22Var;
        this.e = qo9Var;
        this.f = bmcVar;
        this.g = num;
    }

    public jud(String str, dl2 dl2Var, koi koiVar, qi3 qi3Var, mp4 mp4Var) {
        this.a = 2;
        str.getClass();
        mp4Var.getClass();
        this.b = str;
        this.c = dl2Var;
        this.d = koiVar;
        this.e = qi3Var;
        this.f = mp4Var;
        this.g = new mdg();
    }

    public jud(jqh jqhVar) {
        this.a = 3;
        this.b = jqhVar;
        iz8 iz8Var = nz8.F;
        this.c = vde.I;
        this.d = aee.K;
    }
}
