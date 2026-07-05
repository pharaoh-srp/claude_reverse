package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public enum rmk implements erj {
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_SMART_REPLY_CLOSE(0),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_LANGUAGE_IDENTIFICATION_DETECT(1),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_FACE_CREATE(2),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_FACE_CLOSE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_FACE_LOAD(4),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_TEXT_DETECT(11),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_TEXT_CREATE(12),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE(13),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_TEXT_LOAD(14),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_BARCODE_CREATE(21),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_BARCODE_CREATE(22),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_IMAGE_LABEL_DETECT(23),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_BARCODE_LOAD(24),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_IMAGE_LABEL_DETECT(141),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_IMAGE_LABEL_CREATE(142),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE(143),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_SMART_REPLY_CLOSE(144),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_LANGUAGE_IDENTIFICATION_DETECT(151),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE(152),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_SMART_REPLY_CLOSE(153),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_LANGUAGE_IDENTIFICATION_DETECT(154),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE(155),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_LANGUAGE_IDENTIFICATION_DETECT(161),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE(162),
    ON_DEVICE_LANGUAGE_IDENTIFICATION_LOAD(164),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_LANGUAGE_IDENTIFICATION_CLOSE(163),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_TRANSLATOR_TRANSLATE(171),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_TRANSLATOR_CREATE(172),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_TRANSLATOR_LOAD(173),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_TRANSLATOR_CLOSE(174),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_TRANSLATOR_DOWNLOAD(175),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_ENTITY_EXTRACTION_ANNOTATE(241),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_ENTITY_EXTRACTION_CREATE(242),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_ENTITY_EXTRACTION_LOAD(243),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_ENTITY_EXTRACTION_CLOSE(244),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_ENTITY_EXTRACTION_DOWNLOAD(245),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_OBJECT_CREATE(191),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_OBJECT_LOAD(192),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_OBJECT_INFERENCE(193),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_OBJECT_CLOSE(194),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_DI_CREATE(311),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_DI_LOAD(312),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_DI_DOWNLOAD(313),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_DI_RECOGNIZE(314),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_DI_CLOSE(315),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_POSE_CREATE(321),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_POSE_LOAD(322),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_POSE_INFERENCE(323),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_POSE_CLOSE(324),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_POSE_PRELOAD(325),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_SEGMENTATION_CREATE(331),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_SEGMENTATION_LOAD(332),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_SEGMENTATION_INFERENCE(333),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_SEGMENTATION_CLOSE(334),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOM_OBJECT_CREATE(341),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOM_OBJECT_LOAD(342),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOM_OBJECT_INFERENCE(343),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOM_OBJECT_CLOSE(344),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOM_IMAGE_LABEL_CREATE(351),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOM_IMAGE_LABEL_LOAD(352),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOM_IMAGE_LABEL_DETECT(353),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOM_IMAGE_LABEL_CLOSE(354),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_FACE_DETECT(31),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_FACE_CREATE(32),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_FACE_CLOSE(33),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_CROP_HINTS_CREATE(41),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_CROP_HINTS_DETECT(42),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_CROP_HINTS_CLOSE(43),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_DOCUMENT_TEXT_CREATE(51),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_DOCUMENT_TEXT_DETECT(52),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_DOCUMENT_TEXT_CLOSE(53),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_IMAGE_PROPERTIES_CREATE(61),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_IMAGE_PROPERTIES_DETECT(62),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_IMAGE_PROPERTIES_CLOSE(63),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_IMAGE_LABEL_CREATE(71),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_IMAGE_LABEL_DETECT(72),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_IMAGE_LABEL_CLOSE(73),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_LANDMARK_CREATE(81),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_LANDMARK_DETECT(82),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_LANDMARK_CLOSE(83),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_LOGO_CREATE(91),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_LOGO_DETECT(92),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_LOGO_CLOSE(93),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_SAFE_SEARCH_CREATE(111),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_SAFE_SEARCH_DETECT(112),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_SAFE_SEARCH_CLOSE(113),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_TEXT_CREATE(121),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_TEXT_DETECT(ModuleDescriptor.MODULE_VERSION),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_TEXT_CLOSE(123),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_WEB_SEARCH_CREATE(131),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_WEB_SEARCH_DETECT(132),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUD_WEB_SEARCH_CLOSE(133),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOM_MODEL_RUN(102),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOM_MODEL_CREATE(103),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOM_MODEL_CLOSE(104),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOM_MODEL_LOAD(105),
    /* JADX INFO: Fake field, exist only in values array */
    AUTOML_IMAGE_LABELING_RUN(181),
    /* JADX INFO: Fake field, exist only in values array */
    AUTOML_IMAGE_LABELING_CREATE(182),
    /* JADX INFO: Fake field, exist only in values array */
    AUTOML_IMAGE_LABELING_CLOSE(183),
    /* JADX INFO: Fake field, exist only in values array */
    AUTOML_IMAGE_LABELING_LOAD(184),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_DOWNLOAD(100),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_UPDATE(101),
    /* JADX INFO: Fake field, exist only in values array */
    REMOTE_MODEL_IS_DOWNLOADED(251),
    /* JADX INFO: Fake field, exist only in values array */
    REMOTE_MODEL_DELETE_ON_DEVICE(252),
    /* JADX INFO: Fake field, exist only in values array */
    ACCELERATION_ANALYTICS(260),
    /* JADX INFO: Fake field, exist only in values array */
    PIPELINE_ACCELERATION_ANALYTICS(261),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATED_AUTO_ML_IMAGE_LABELING_INFERENCE(200),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATED_CUSTOM_MODEL_INFERENCE(201),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATED_ON_DEVICE_BARCODE_DETECTION(202),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATED_ON_DEVICE_FACE_DETECTION(203),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION(204),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATED_ON_DEVICE_OBJECT_INFERENCE(205),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATED_ON_DEVICE_TEXT_DETECTION(206),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATED_ON_DEVICE_POSE_DETECTION(207),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATED_ON_DEVICE_SEGMENTATION(208),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATED_CUSTOM_OBJECT_INFERENCE(209),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATED_CUSTOM_IMAGE_LABEL_DETECTION(210),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATED_ON_DEVICE_EXPLICIT_CONTENT_DETECTION(211),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATED_ON_DEVICE_SELFIE_FACE_DETECTION(212),
    /* JADX INFO: Fake field, exist only in values array */
    REMOTE_CONFIG_FETCH(271),
    /* JADX INFO: Fake field, exist only in values array */
    REMOTE_CONFIG_ACTIVATE(272),
    /* JADX INFO: Fake field, exist only in values array */
    REMOTE_CONFIG_LOAD(273),
    /* JADX INFO: Fake field, exist only in values array */
    REMOTE_CONFIG_FRC_FETCH(281),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_INIT(291),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_REGISTER_NEW_ID(292),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_REFRESH_TEMPORARY_TOKEN(293),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_CREATE_INSTALLATION(301),
    /* JADX INFO: Fake field, exist only in values array */
    INSTALLATION_ID_FIS_GENERATE_AUTH_TOKEN(302),
    /* JADX INFO: Fake field, exist only in values array */
    INPUT_IMAGE_CONSTRUCTION(361),
    /* JADX INFO: Fake field, exist only in values array */
    HANDLE_LEAKED(371),
    /* JADX INFO: Fake field, exist only in values array */
    CAMERA_SOURCE(381),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_IMAGE_LABELING(391),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_LANGUAGE_ID(401),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_LANGUAGE_ID_CREATE(402),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_LANGUAGE_ID_INIT(403),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_LANGUAGE_ID_INFERENCE(404),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_LANGUAGE_ID_RELEASE(405),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_NLCLASSIFIER(411),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_NLCLASSIFIER_CREATE(412),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_NLCLASSIFIER_INIT(413),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_NLCLASSIFIER_INFERENCE(414),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_NLCLASSIFIER_RELEASE(415),
    /* JADX INFO: Fake field, exist only in values array */
    NLCLASSIFIER_CLIENT_LIBRARY(421),
    /* JADX INFO: Fake field, exist only in values array */
    NLCLASSIFIER_CLIENT_LIBRARY_CREATE(422),
    /* JADX INFO: Fake field, exist only in values array */
    NLCLASSIFIER_CLIENT_LIBRARY_CLASSIFY(423),
    /* JADX INFO: Fake field, exist only in values array */
    NLCLASSIFIER_CLIENT_LIBRARY_CLOSE(424),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_FACE_DETECTION(441),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_FACE_DETECTION_CREATE(461),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_FACE_DETECTION_INIT(462),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_FACE_DETECTION_INFERENCE(463),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_FACE_DETECTION_RELEASE(464),
    /* JADX INFO: Fake field, exist only in values array */
    ACCELERATION_ALLOWLIST_GET(431),
    /* JADX INFO: Fake field, exist only in values array */
    ACCELERATION_ALLOWLIST_FETCH(432),
    /* JADX INFO: Fake field, exist only in values array */
    ODML_IMAGE(442),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_BARCODE_DETECTION(443),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_BARCODE_DETECTION_CREATE(471),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_BARCODE_DETECTION_INIT(472),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_BARCODE_DETECTION_INFERENCE(473),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_BARCODE_DETECTION_RELEASE(474),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_BARCODE_DETECTION_INFERENCE_AFTER_RELEASE(475),
    /* JADX INFO: Fake field, exist only in values array */
    TOXICITY_DETECTION_CREATE_EVENT(451),
    /* JADX INFO: Fake field, exist only in values array */
    TOXICITY_DETECTION_LOAD_EVENT(452),
    /* JADX INFO: Fake field, exist only in values array */
    TOXICITY_DETECTION_INFERENCE_EVENT(453),
    /* JADX INFO: Fake field, exist only in values array */
    TOXICITY_DETECTION_DOWNLOAD_EVENT(454),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_CUSTOM_IMAGE_LABELING_CREATE(481),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_CUSTOM_IMAGE_LABELING_INIT(482),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_CUSTOM_IMAGE_LABELING_INFERENCE(483),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_CUSTOM_IMAGE_LABELING_RELEASE(484),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_SCAN_API(491),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_OPTIONAL_MODULE(492),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_EXPLICIT_CONTENT_CREATE(501),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_EXPLICIT_CONTENT_LOAD(502),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_EXPLICIT_CONTENT_DETECT(503),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_EXPLICIT_CONTENT_CLOSE(504),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_SELFIE_FACE_CREATE(511),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_SELFIE_FACE_LOAD(512),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_SELFIE_FACE_DETECT(513),
    /* JADX INFO: Fake field, exist only in values array */
    ON_DEVICE_SELFIE_FACE_CLOSE(514),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_SMART_REPLY_CREATE(521),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_SMART_REPLY_INIT(522),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_SMART_REPLY_INFERENCE(523),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_MODULE_SMART_REPLY_RELEASE(524);

    public final int E;

    rmk(int i) {
        this.E = i;
    }

    @Override // defpackage.erj
    public final int zza() {
        return this.E;
    }
}
