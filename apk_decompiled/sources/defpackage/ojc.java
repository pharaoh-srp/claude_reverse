package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ojc {
    public static final jf7[] a = new jf7[0];
    public static final jf7 b;
    public static final ytj c;
    public static final ytj d;

    static {
        jf7 jf7Var = new jf7("vision.barcode", 1L);
        jf7 jf7Var2 = new jf7("vision.custom.ica", 1L);
        jf7 jf7Var3 = new jf7("vision.face", 1L);
        jf7 jf7Var4 = new jf7("vision.ica", 1L);
        jf7 jf7Var5 = new jf7("vision.ocr", 1L);
        jf7 jf7Var6 = new jf7("mlkit.langid", 1L);
        b = jf7Var6;
        jf7 jf7Var7 = new jf7("mlkit.nlclassifier", 1L);
        jf7 jf7Var8 = new jf7("tflite_dynamite", 1L);
        jf7 jf7Var9 = new jf7("mlkit.barcode.ui", 1L);
        jf7 jf7Var10 = new jf7("mlkit.smartreply", 1L);
        s20 s20Var = new s20();
        s20Var.q("barcode", jf7Var);
        s20Var.q("custom_ica", jf7Var2);
        s20Var.q("face", jf7Var3);
        s20Var.q("ica", jf7Var4);
        s20Var.q("ocr", jf7Var5);
        s20Var.q("langid", jf7Var6);
        s20Var.q("nlclassifier", jf7Var7);
        s20Var.q("tflite_dynamite", jf7Var8);
        s20Var.q("barcode_ui", jf7Var9);
        s20Var.q("smart_reply", jf7Var10);
        jsj jsjVar = (jsj) s20Var.G;
        if (jsjVar != null) {
            throw jsjVar.a();
        }
        ytj ytjVarA = ytj.a(s20Var.E, (Object[]) s20Var.F, s20Var);
        jsj jsjVar2 = (jsj) s20Var.G;
        if (jsjVar2 != null) {
            throw jsjVar2.a();
        }
        c = ytjVarA;
        s20 s20Var2 = new s20();
        s20Var2.q("com.google.android.gms.vision.barcode", jf7Var);
        s20Var2.q("com.google.android.gms.vision.custom.ica", jf7Var2);
        s20Var2.q("com.google.android.gms.vision.face", jf7Var3);
        s20Var2.q("com.google.android.gms.vision.ica", jf7Var4);
        s20Var2.q("com.google.android.gms.vision.ocr", jf7Var5);
        s20Var2.q("com.google.android.gms.mlkit.langid", jf7Var6);
        s20Var2.q("com.google.android.gms.mlkit.nlclassifier", jf7Var7);
        s20Var2.q("com.google.android.gms.tflite_dynamite", jf7Var8);
        s20Var2.q("com.google.android.gms.mlkit_smartreply", jf7Var10);
        jsj jsjVar3 = (jsj) s20Var2.G;
        if (jsjVar3 != null) {
            throw jsjVar3.a();
        }
        ytj ytjVarA2 = ytj.a(s20Var2.E, (Object[]) s20Var2.F, s20Var2);
        jsj jsjVar4 = (jsj) s20Var2.G;
        if (jsjVar4 != null) {
            throw jsjVar4.a();
        }
        d = ytjVarA2;
    }

    public static jf7[] a(ytj ytjVar, w5l w5lVar) {
        jf7[] jf7VarArr = new jf7[w5lVar.K];
        for (int i = 0; i < w5lVar.K; i++) {
            jf7 jf7Var = (jf7) ytjVar.get(w5lVar.get(i));
            dgj.v(jf7Var);
            jf7VarArr[i] = jf7Var;
        }
        return jf7VarArr;
    }
}
