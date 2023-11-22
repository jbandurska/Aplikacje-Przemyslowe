import csv
from xml.etree.ElementTree import Element, SubElement, ElementTree


def csv_to_xml(csv_file, xml_file):
    with open(csv_file, "r") as csvfile:
        csvreader = csv.DictReader(csvfile)

        root = Element(
            "beans",
            {
                "xmlns": "http://www.springframework.org/schema/beans",
                "xmlns:xsi": "http://www.w3.org/2001/XMLSchema-instance",
                "xsi:schemaLocation": "http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd",
            },
        )

        for row in csvreader:
            person_id = row["id"]
            first_name = row["first_name"]
            last_name = row["last_name"]
            email = row["email"]
            company_name = row["company_name"]

            bean = SubElement(
                root,
                "bean",
                {
                    "id": f"{person_id}{first_name}{last_name}",
                    "class": "pl.edu.ug.tent.springintro.domain.Person",
                },
            )

            SubElement(bean, "property", name="firstName", value=first_name)
            SubElement(bean, "property", name="lastName", value=last_name)
            SubElement(bean, "property", name="email", value=email)
            SubElement(bean, "property", name="companyName", value=company_name)

        tree = ElementTree(root)
        tree.write(xml_file, encoding="utf-8", xml_declaration=True)


if __name__ == "__main__":
    csv_file_path = "MOCK_DATA.csv"
    xml_file_path = "beans.xml"

    csv_to_xml(csv_file_path, xml_file_path)
