package defpackage;

import com.anthropic.claude.tool.model.RequestFormInputFromUserInputFieldsItemType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class rje {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RequestFormInputFromUserInputFieldsItemType.values().length];
        try {
            iArr[RequestFormInputFromUserInputFieldsItemType.PASSWORD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RequestFormInputFromUserInputFieldsItemType.EMAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RequestFormInputFromUserInputFieldsItemType.PHONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RequestFormInputFromUserInputFieldsItemType.NUMBER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
