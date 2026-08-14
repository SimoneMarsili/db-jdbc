package db_lab.data;

public final class Queries {

    public static final String TAGS_FOR_PRODUCT =
        """
        SELECT tag_name
        FROM tagged
        WHERE product_code = ?
        """;

    public static final String LIST_PRODUCTS =
        """
        SELECT code, name
        FROM product
        """;

    public static final String PRODUCT_COMPOSITION =
        """
        SELECT M.code, M.description, C.percent
        FROM composition C, material M
        WHERE C.material_code = M.code
        and C.product_code = ?
        """;

    public static final String FIND_PRODUCT =
        """
        SELECT name, description
        FROM product
        WHERE code = ?
        """;
}
