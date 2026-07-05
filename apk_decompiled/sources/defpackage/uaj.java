package defpackage;

import android.content.Context;
import com.anthropic.claude.R;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uaj {
    public static final Set a = mp0.Z0(new String[]{"jpg", "jpeg", "png", "gif", "bmp", "webp", "svg", "ico", "tiff", "tif"});

    public static final int a(String str) {
        str.getClass();
        mi7 mi7VarD = d(str);
        switch (mi7VarD == null ? -1 : taj.a[mi7VarD.ordinal()]) {
            case -1:
                ud0 ud0Var = ud0.d;
                ud0 ud0Var2 = ud0.d;
                return R.drawable.anthropicon_files;
            case 0:
            default:
                wg6.i();
                return 0;
            case 1:
                ud0 ud0Var3 = ud0.d;
                ud0 ud0Var4 = ud0.d;
                return R.drawable.anthropicon_code;
            case 2:
            case 3:
                ud0 ud0Var5 = ud0.d;
                ud0 ud0Var6 = ud0.d;
                return R.drawable.anthropicon_chart;
            case 4:
                ud0 ud0Var7 = ud0.d;
                ud0 ud0Var8 = ud0.d;
                return R.drawable.anthropicon_file;
            case 5:
                ud0 ud0Var9 = ud0.d;
                ud0 ud0Var10 = ud0.d;
                return R.drawable.anthropicon_image;
            case 6:
                ud0 ud0Var11 = ud0.d;
                ud0 ud0Var12 = ud0.d;
                return R.drawable.anthropicon_file;
            case 7:
                ud0 ud0Var13 = ud0.d;
                ud0 ud0Var14 = ud0.d;
                return R.drawable.anthropicon_cards;
        }
    }

    public static final String b(Context context, String str) {
        context.getClass();
        str.getClass();
        String strC = c(context, str);
        if (strC.length() != 0) {
            return strC;
        }
        String string = context.getString(R.string.file_fallback);
        string.getClass();
        return string;
    }

    public static final String c(Context context, String str) {
        String upperCase;
        context.getClass();
        str.getClass();
        String strE1 = bsg.e1(str, ".", "");
        if (strE1.length() <= 0 || strE1.equals(str)) {
            upperCase = null;
        } else {
            upperCase = strE1.toUpperCase(Locale.ROOT);
            upperCase.getClass();
        }
        mi7 mi7VarD = d(str);
        String string = mi7VarD != null ? context.getString(mi7VarD.E) : null;
        String str2 = (string == null || upperCase == null) ? "" : " · ";
        if (string == null) {
            string = "";
        }
        return ij0.C(string, str2, upperCase != null ? upperCase : "");
    }

    public static final mi7 d(String str) {
        str.getClass();
        String lowerCase = bsg.e1(str, ".", "").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (lowerCase.length() == 0) {
            return null;
        }
        if (lowerCase.equals("csv") || lowerCase.equals("tsv")) {
            return mi7.TABLE;
        }
        if (lowerCase.equals("xls") || lowerCase.equals("xlsx")) {
            return mi7.SPREADSHEET;
        }
        if (lowerCase.equals("ppt") || lowerCase.equals("pptx")) {
            return mi7.PRESO;
        }
        if (lowerCase.equals("pdf") || lowerCase.equals("md") || lowerCase.equals("markdown") || lowerCase.equals("doc") || lowerCase.equals("docx")) {
            return mi7.DOC;
        }
        if (lowerCase.equals("mermaid") || lowerCase.equals("mmd")) {
            return mi7.DIAGRAM;
        }
        boolean zEquals = lowerCase.equals("jsx");
        mi7 mi7Var = mi7.CODE;
        if (zEquals || lowerCase.equals("tsx")) {
            return mi7Var;
        }
        if (a.contains(lowerCase)) {
            return mi7.IMAGE;
        }
        if (ikb.a.contains(lowerCase)) {
            return mi7Var;
        }
        return null;
    }
}
